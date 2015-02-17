package com.ac.games.data;

/**
 * This class is just a container for the mmID to help with Serialization.
 * 
 * @author ac010168
 *
 */
public class MMIDOnlyData {

  /** The objectid for this game on miniature market */
  private long mmID;
  
  public MMIDOnlyData() {
    mmID = -1;
  }
  
  public MMIDOnlyData(long mmID) {
    this.mmID = mmID;
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
}
