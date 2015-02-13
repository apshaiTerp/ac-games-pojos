package com.ac.games.data.parser;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ac.games.data.*;

/**
 * 
 * @author ac010168
 */
public class MiniatureMarketParser {
  
  public static boolean debugMode = false;

  /** A basic date formatter object.  We'll use it to condense dates. */
  public final static SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM-dd HH:mm:ss.SSS");
  
  /** 
   * Easiest tag to find the title.  Should look like this:
   * <meta property="og:title" content="Cosmic Encounter "/>
   */
  public final static String TITLE_MARKER        = "<meta property=\"og:title\" content=\"";
  /**
   * Tag to help identify the image.  The start of the tag should look like this:
   * <meta property="og:image" content="http://cdn.miniaturemarket.com/media/catalog/product/a/s/asmaby01us.jpg"/>
   */
  public final static String IMAGE_MARKER        = "<meta property=\"og:image\" content=\"";
  
  /** We're going to read the value, if present, out of the meta keywords tag near the top of the file */
  public final static String SKU_MARKER          = "var product_code = \"";
  /** 
   * These values are a little more complicated.  They include the id values in part of the tags.
   * <span class="price" id="old-price-XXXXX">
   *                 $89.10                </span>
   */
  public final static String MSRP_MARKER         = "<span class=\"price\" id=\"old-price-";
  /** 
   * These values are a little more complicated.  They include the id values in part of the tags.
   * <span class="price" id="product-price-XXXXX">
   *                 $66.83                </span>
   */
  public final static String OUR_PRICE_MARKER    = "<span class=\"price\" id=\"product-price-";
  //**********  These are flexible fields  **********
  /** The out of stock marker tag */
  public final static String OUT_OF_STOCK_MARKER = "class=\"availability out-of-stock\"";
  /** The in stock marker tag */
  public final static String IN_STOCK_MARKER     = "class=\"availability in-stock\"";
  /** 
   * These are fairly straight-forward tags, only one will exist
   * <div class="stock-qty preorder">
   */
  public final static String PREORDER_MARKER     = "<div class=\"stock-qty preorder\">";

  public static MiniatureMarketPriceData parseMMHTML(String htmlContent) throws Throwable {
    Date startDate = null;
    if (debugMode) {
      startDate = new Date();
      System.out.println ("Starting Parse at " + dateFormatter.format(startDate));
    }
    
    MiniatureMarketPriceData data = new MiniatureMarketPriceData();
    
    //Get the title
    int titleMarkerPos = htmlContent.indexOf(TITLE_MARKER);
    if (titleMarkerPos != -1) {
      String title = htmlContent.substring(titleMarkerPos + TITLE_MARKER.length(), 
          htmlContent.indexOf("\"/>", titleMarkerPos + TITLE_MARKER.length()));
      data.setTitle(title.replace(" - Board Games", "").replace("Board Games", "").trim());
    } else throw new Throwable ("Could not find the Title tag correctly.");

    //Get the SKU
    int skuMarkerPos = htmlContent.indexOf(SKU_MARKER);
    if (skuMarkerPos != -1) {
      String sku = htmlContent.substring(skuMarkerPos + SKU_MARKER.length(), 
          htmlContent.indexOf("\";", skuMarkerPos + SKU_MARKER.length()));
      data.setSku(sku);
    } else throw new Throwable ("Could not find the Title tag correctly.");

    //Get the MMID, which also contains the clues to the Miniature Market price
    int ourPricePos = htmlContent.indexOf(OUR_PRICE_MARKER);
    String idValue = null;
    if (ourPricePos != -1) {
      idValue = htmlContent.substring(ourPricePos + OUR_PRICE_MARKER.length(), 
          htmlContent.indexOf("\">", ourPricePos + OUR_PRICE_MARKER.length()));
      data.setMmID(Long.parseLong(idValue));
    } else throw new Throwable ("Could not find the ID value correctly.");
    
    //Get the Availability status
    int inStockMarker    = htmlContent.indexOf(IN_STOCK_MARKER);
    int outOfStockMarker = htmlContent.indexOf(OUT_OF_STOCK_MARKER);
    int preOrderMarker   = htmlContent.indexOf(PREORDER_MARKER);
    if (outOfStockMarker != -1) {
      if (preOrderMarker != -1) data.setAvailability(GameAvailability.NOTYETTAKINGORDERS);
      else                      data.setAvailability(GameAvailability.OUTOFSTOCK);
    } else if (inStockMarker != -1) {
      if (preOrderMarker != -1) data.setAvailability(GameAvailability.PREORDER);
      else                      data.setAvailability(GameAvailability.INSTOCK);
    } else throw new Throwable ("I couldn't find out what the availability state is");
    
    final String PRICE_MARKER_ADDITIONS = idValue + "\">";
    //Get the MSRP
    int msrpMarkerPos = htmlContent.indexOf(MSRP_MARKER);
    if (msrpMarkerPos != -1) {
      String msrpValue = htmlContent.substring(msrpMarkerPos + MSRP_MARKER.length() + PRICE_MARKER_ADDITIONS.length(), 
          htmlContent.indexOf("</span>", msrpMarkerPos + MSRP_MARKER.length() + PRICE_MARKER_ADDITIONS.length()));
      data.setMsrpValue(Double.parseDouble(msrpValue.trim().replace("$", "")));
    } else throw new Throwable ("Could not find the MSRP Price (old-price) correctly.");
    
    int priceMarkerPos = htmlContent.indexOf(OUR_PRICE_MARKER);
    if (priceMarkerPos != -1) {
      String priceValue = htmlContent.substring(priceMarkerPos + OUR_PRICE_MARKER.length() + PRICE_MARKER_ADDITIONS.length(), 
          htmlContent.indexOf("</span>", priceMarkerPos + OUR_PRICE_MARKER.length() + PRICE_MARKER_ADDITIONS.length()));
      data.setCurPrice(Double.parseDouble(priceValue.trim().replace("$", "")));
    } else throw new Throwable ("Could not find the MSRP Price (old-price) correctly.");
    
    //Get the Image tag
    int imageMarkerPos = htmlContent.indexOf(IMAGE_MARKER);
    if (imageMarkerPos != -1) {
      String imageString = htmlContent.substring(imageMarkerPos + IMAGE_MARKER.length(), 
          htmlContent.indexOf("\"", imageMarkerPos + IMAGE_MARKER.length()));
      data.setImageURL(imageString);
    }

    return data;
  }
}
