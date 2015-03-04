package com.ac.games.data;

/**
 * @author ac010168
 *
 */
public class GameIDOnlyData {

  private long gameID;
  
  public GameIDOnlyData() {
    setGameID(-1);
  }
  
  public GameIDOnlyData(long gameID) {
    this.gameID = gameID;
  }

  /**
   * @return the gameID
   */
  public long getGameID() {
    return gameID;
  }

  /**
   * @param gameID the gameID to set
   */
  public void setGameID(long gameID) {
    this.gameID = gameID;
  }
}
