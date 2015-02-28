package com.ac.games.data;

/**
 * @author ac010168
 *
 */
public class CoolStuffIncCategoryConverter {

  /** Integer flag corresponding to no CoolStuffIncCategory found */
  public final static int DEFAULT_FLAG     = -1;
  /** Integer flag corresponding to CCGs */
  public final static int COLLECTIBLE_FLAG = 0; 
  /** Integer flag corresponding to Dice Masters (which is a subtype of CCG that matters) */
  public final static int DICEMASTERS_FLAG = 1;
  /** Integer flag corresponding to Board Games */
  public final static int BOARDGAMES_FLAG  = 2;
  /** Integer flag corresponding to Role Playing Games */
  public final static int RPGS_FLAG        = 3;
  /** Integer flag corresponding to Living Card Games */
  public final static int LCGS_FLAG        = 4;
  /** Integer flag corresponding to CCGs */
  public final static int SUPPLIES_FLAG    = 5;
  
  /**
   * Helper method to convert from CoolStuffIncCategory enum to a static flag value.
   * @param category
   * @return
   */
  public static int convertCSICategoryToFlag(CoolStuffIncCategory category) {
    if (category == null) return DEFAULT_FLAG;
    switch (category) {
      case COLLECTIBLE : return COLLECTIBLE_FLAG;
      case DICEMASTERS : return DICEMASTERS_FLAG;
      case BOARDGAMES  : return BOARDGAMES_FLAG;
      case RPGS        : return RPGS_FLAG;
      case LCGS        : return LCGS_FLAG;
      case SUPPLIES    : return SUPPLIES_FLAG;
      default          : return DEFAULT_FLAG;
    }
  }

  /**
   * Helper method to convert from static flag value to enum.
   * @param flag
   * @return
   */
  public static CoolStuffIncCategory convertFlagToCSICategory(int flag) {
    switch (flag) {
      case DEFAULT_FLAG     : return null;
      case COLLECTIBLE_FLAG : return CoolStuffIncCategory.COLLECTIBLE;
      case DICEMASTERS_FLAG : return CoolStuffIncCategory.DICEMASTERS;
      case BOARDGAMES_FLAG  : return CoolStuffIncCategory.BOARDGAMES;
      case RPGS_FLAG        : return CoolStuffIncCategory.RPGS;
      case LCGS_FLAG        : return CoolStuffIncCategory.LCGS;
      case SUPPLIES_FLAG    : return CoolStuffIncCategory.SUPPLIES;
      default               : return null;
    }
  }
}
