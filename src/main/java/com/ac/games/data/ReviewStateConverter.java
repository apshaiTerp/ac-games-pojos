package com.ac.games.data;

/**
 * This class exists because even though Enums are serializable by default, they don't
 * serialize when converting through BSON, so we need to have a conversion mapper that
 * translates the Enum into a common flag to assist BSON parsing.
 *
 * @author ac010168
 */
public class ReviewStateConverter {

  /** Integer flag corresponding to no GameAvailability set */
  public final static int DEFAULT_FLAG  = -1;
  /** Integer flag corresponding to In Stock */
  public final static int PENDING_FLAG  = 0;
  /** Integer flag corresponding to Out of Stock */
  public final static int REVIEWED_FLAG = 1;
  
  /**
   * Helper method to convert from ReviewState enum to a static flag value.
   * @param state
   * @return
   */
  public static int convertReviewStateToFlag(ReviewState state) {
    if (state == null) return DEFAULT_FLAG;
    switch (state) {
      case PENDING  : return PENDING_FLAG;
      case REVIEWED : return REVIEWED_FLAG;
      default       : return DEFAULT_FLAG;
    }
  }

  /**
   * Helper method to convert from static flag value to enum.
   * @param flag
   * @return
   */
  public static ReviewState convertFlagToReviewState(int flag) {
    switch (flag) {
      case DEFAULT_FLAG  : return null;
      case PENDING_FLAG  : return ReviewState.PENDING;
      case REVIEWED_FLAG : return ReviewState.REVIEWED;
      default            : return null;
    }
  }
}
