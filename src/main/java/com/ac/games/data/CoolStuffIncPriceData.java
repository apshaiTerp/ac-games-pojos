package com.ac.games.data;

import java.text.DecimalFormat;

/**
 * @author ac010168
 *
 */
public class CoolStuffIncPriceData {

  /** Cool Stuff Inc Game ID */
  private long csiID;
  /** The SKU used to look up the product.  Used by other vendors as well */
  private String sku;
  /** The Game title from CSI, used to help make matching to BGG game values */
  private String title;
  /** The image shown for the product */
  private String imageURL;
  /** The game availability value, defined by the {@link GameAvailability} enum */
  private GameAvailability availability;
  //**********  The following values are only conditionally present  **********
  /** The MSRP value listed from CSI.  Cannot be found the game is not available */
  private double msrpValue;
  /** The current price listed on CSI.  Cannot be found the game is not available */
  private double curPrice;
  /** The upcoming release date, listed with PreOrders and some Out of Print products */
  private String releaseDate;
  
  //TODO - Probably need to figure out the category so I can weed out the HORDES of CCGs
  //and other single items CSI sells
  
  
  public final static DecimalFormat moneyFormat = new DecimalFormat("$###,###.##");
  
  public CoolStuffIncPriceData() {
    csiID        = -1L;
    sku          = null;
    title        = null;
    imageURL     = null;
    availability = null;
    releaseDate  = null;
    msrpValue    = -1.0;
    curPrice     = -1.0;
  }
  
  /**
   * Debug Helper to dump out the contents of this object
   */
  public void printContentsForDebug() {
    System.out.println ("Printing contents for Game ID " + getCsiID());
    System.out.println ("============================================================");
    System.out.println ("Game Title:          " + getTitle());
    System.out.println ("Game Image:          " + getImageURL());
    System.out.println ("SKU:                 " + getSku());
    switch (getAvailability()) {
      case INSTOCK            : System.out.println ("Availability:        In Stock"); break;
      case PREORDER           : System.out.println ("Availability:        Pre-Order"); break;
      case OUTOFSTOCK         : System.out.println ("Availability:        Out of Stock"); break;
      case NOTYETTAKINGORDERS : System.out.println ("Availability:        Not Yet Taking Orders"); break;
      default : System.out.println ("Availability:        Unknown");
    }
    System.out.println ("Expected Release:    " + ((getReleaseDate() == null) ? "[-]" : releaseDate));
    System.out.println ("MSRP:                " + ((getMsrpValue() == -1L) ? "[-]" : moneyFormat.format(getMsrpValue())));
    System.out.println ("Current Price:       " + ((getCurPrice() == -1L) ? "[-]" : moneyFormat.format(getCurPrice())));
  }

  /**
   * @return the csiID
   */
  public long getCsiID() {
    return csiID;
  }

  /**
   * @param csiID the csiID to set
   */
  public void setCsiID(long csiID) {
    this.csiID = csiID;
  }

  /**
   * @return the sku
   */
  public String getSku() {
    return sku;
  }

  /**
   * @param sku the sku to set
   */
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the imageURL
   */
  public String getImageURL() {
    return imageURL;
  }

  /**
   * Adding functionality to this method to strip out the inserted autosizing of the image.
   * 
   * @param imageURL the imageURL to set
   */
  public void setImageURL(String imageURL) {
    if (imageURL == null) this.imageURL = imageURL;
    else this.imageURL = imageURL.replace("c_pad,h_300,w_300/", "");
  }

  /**
   * @return the availability
   */
  public GameAvailability getAvailability() {
    return availability;
  }

  /**
   * @param availability the availability to set
   */
  public void setAvailability(GameAvailability availability) {
    this.availability = availability;
  }

  /**
   * @return the msrpValue
   */
  public double getMsrpValue() {
    return msrpValue;
  }

  /**
   * @param msrpValue the msrpValue to set
   */
  public void setMsrpValue(double msrpValue) {
    this.msrpValue = msrpValue;
  }

  /**
   * @return the curPrice
   */
  public double getCurPrice() {
    return curPrice;
  }

  /**
   * @param curPrice the curPrice to set
   */
  public void setCurPrice(double curPrice) {
    this.curPrice = curPrice;
  }

  /**
   * @return the releaseDate
   */
  public String getReleaseDate() {
    return releaseDate;
  }

  /**
   * @param releaseDate the releaseDate to set
   */
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }
}
