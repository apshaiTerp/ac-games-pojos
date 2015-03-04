package com.ac.games.data;

/**
 * @author ac010168
 *
 */
public class GameReltnIDOnlyData {

  private long reltnID;
  
  public GameReltnIDOnlyData() {
    reltnID = -1;
  }
  
  public GameReltnIDOnlyData(long reltnID) {
    this.reltnID = reltnID;
  }

  /**
   * @return the reltnID
   */
  public long getReltnID() {
    return reltnID;
  }

  /**
   * @param reltnID the reltnID to set
   */
  public void setReltnID(long reltnID) {
    this.reltnID = reltnID;
  }
}
