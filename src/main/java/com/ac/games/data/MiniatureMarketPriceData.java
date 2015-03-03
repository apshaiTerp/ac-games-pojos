package com.ac.games.data;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * @author ac010168
 *
 */
public class MiniatureMarketPriceData {

  /** Miniature Market Game ID */
  private long mmID;
  /** The SKU used to look up the product.  Used by other vendors as well */
  private String sku;
  /** The Game title from Miniature Market, used to help make matching to BGG game values */
  private String title;
  /** The image shown for the product */
  private String imageURL;
  /** The game availability value, defined by the {@link GameAvailability} enum */
  private GameAvailability availability;
  //**********  The following values are only conditionally present  **********
  /** The MSRP value listed from MM.  Cannot be found the game is not available */
  private double msrpValue;
  /** The current price listed on MM.  Cannot be found the game is not available */
  private double curPrice;
  /** Adding category requirements */
  private MiniatureMarketCategory category;
  
  //**********  These are fields to help with the data review  **********
  /** Flag to help us know the review state of this object */
  private ReviewState reviewState;
  /** Date this record was added to the system */
  private Date addDate;
  /** Date this record was reviewed */
  private Date reviewDate;
  
  /** Helper to process price values */
  public final static DecimalFormat moneyFormat = new DecimalFormat("$###,###.##");
  
  public MiniatureMarketPriceData() {
    mmID = -1L;
    sku          = null;
    title        = null;
    imageURL     = null;
    availability = null;
    msrpValue    = -1.0;
    curPrice     = -1.0;
    reviewState  = null;
    addDate      = null;
    reviewDate   = null;
    category     = null;
  }
  
  /**
   * Debug Helper to dump out the contents of this object
   */
  public void printContentsForDebug() {
    System.out.println ("Printing contents for Game ID " + getMmID());
    System.out.println ("============================================================");
    System.out.println ("Game Title:          " + getTitle());
    switch (getCategory()) {
      case BOARDGAMES   : System.out.println ("Category:            Board Games"); break;
      case TABLETOP     : System.out.println ("Category:            Table Top Miniatures"); break;
      case CCGS         : System.out.println ("Category:            Collectible Card Games"); break;
      case COLLECTIBLES : System.out.println ("Category:            Collectible Miniatures"); break;
      case RPGS         : System.out.println ("Category:            Role Playing Games"); break;
      case ACCESSORIES  : System.out.println ("Category:            Accessories"); break;
      case UNKNOWN      : System.out.println ("Category:            Unknown"); break;
      default           : System.out.println ("Category:            [-]"); break;
    }
    System.out.println ("Game Image:          " + getImageURL());
    System.out.println ("SKU:                 " + getSku());
    switch (getAvailability()) {
      case INSTOCK            : System.out.println ("Availability:        In Stock"); break;
      case PREORDER           : System.out.println ("Availability:        Pre-Order"); break;
      case OUTOFSTOCK         : System.out.println ("Availability:        Out of Stock"); break;
      case NOTYETTAKINGORDERS : System.out.println ("Availability:        Not Yet Taking Orders"); break;
      default : System.out.println ("Availability:        Unknown");
    }
    System.out.println ("MSRP:                " + ((getMsrpValue() == -1L) ? "[-]" : moneyFormat.format(getMsrpValue())));
    System.out.println ("Current Price:       " + ((getCurPrice() == -1L) ? "[-]" : moneyFormat.format(getCurPrice())));

    if (getReviewState() == null) {
      System.out.println ("Review State:        [-]");
    } else {
      switch (reviewState) {
        case PENDING  : System.out.println ("Review State:        Pending");  break;
        case REVIEWED : System.out.println ("Review State:        Reviewed"); break;
      }
    }
    if (getAddDate() != null) System.out.println ("Add Date:            " + addDate); 
    else                      System.out.println ("Add Date:            [-]"); 
    if (getReviewDate() != null) System.out.println ("Review Date:         " + reviewDate); 
    else                         System.out.println ("Review Date:         [-]"); 
  }

  /**
   * @return the mmID
   */
  public long getMmID() {
    return mmID;
  }

  /**
   * @param mmID the mmID to set
   */
  public void setMmID(long mmID) {
    this.mmID = mmID;
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
   * @param imageURL the imageURL to set
   */
  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
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
   * @return the reviewState
   */
  public ReviewState getReviewState() {
    return reviewState;
  }

  /**
   * @param reviewState the reviewState to set
   */
  public void setReviewState(ReviewState reviewState) {
    this.reviewState = reviewState;
  }

  /**
   * @return the addDate
   */
  public Date getAddDate() {
    return addDate;
  }

  /**
   * @param addDate the addDate to set
   */
  public void setAddDate(Date addDate) {
    this.addDate = addDate;
  }

  /**
   * @return the reviewDate
   */
  public Date getReviewDate() {
    return reviewDate;
  }

  /**
   * @param reviewDate the reviewDate to set
   */
  public void setReviewDate(Date reviewDate) {
    this.reviewDate = reviewDate;
  }

  /**
   * @return the category
   */
  public MiniatureMarketCategory getCategory() {
    return category;
  }

  /**
   * @param category the category to set
   */
  public void setCategory(MiniatureMarketCategory category) {
    this.category = category;
  }

  /**
   * @return the moneyformat
   */
  public static DecimalFormat getMoneyformat() {
    return moneyFormat;
  }

}
