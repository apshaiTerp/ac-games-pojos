package com.ac.games.data;

/**
 * This class is just a container for the bggID to help with Serialization.
 * 
 * @author ac010168
 *
 */
public class BGGIDOnlyData {

  /** The objectid for this game on bgg */
  private long bggID;
  
  public BGGIDOnlyData() {
    bggID = -1;
  }
  
  public BGGIDOnlyData(long bggID) {
    this.bggID = bggID;
  }

  /**
   * @return the bggID
   */
  public long getBggID() {
    return bggID;
  }

  /**
   * @param bggID the bggID to set
   */
  public void setBggID(long bggID) {
    this.bggID = bggID;
  }
}
