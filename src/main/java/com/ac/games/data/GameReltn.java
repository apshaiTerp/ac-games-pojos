package com.ac.games.data;

import java.util.List;

/**
 * @author ac010168
 *
 */
public class GameReltn {
  
  private long         reltnID;
  private long         gameID;
  private long         bggID;
  private long         csiID;
  private long         mmID;
  private List<String> asinKeys;
  private List<Long>   otherSites;

  public GameReltn() {
    reltnID    = -1L;
    gameID     = -1L;
    bggID      = -1L;
    csiID      = -1L;
    mmID       = -1L;
    asinKeys   = null;
    otherSites = null;
  }
  
  public void printContentsForDebug() {
    System.out.println ("Printing contents for GameReltn ID " + getReltnID());
    System.out.println ("============================================================");
    System.out.println ("Game ID:            " + (gameID == -1L ? "-" : getGameID()));
    System.out.println ("BoardGameGeek ID:   " + (bggID == -1L ? "-" : getBggID()));
    System.out.println ("CoolStuffInc ID:    " + (csiID == -1L ? "-" : getCsiID()));
    System.out.println ("MiniatureMarket ID: " + (mmID == -1L ? "-" : getMmID()));
    
    if (getAsinKeys() != null) {
      System.out.println ("AsinKeys:           [" + asinKeys.size() + "]");
      for (String asinKey : asinKeys)
        System.out.println ("                     " + asinKey);
    } else System.out.println ("AsinKeys:           [-]");
    
    if (getOtherSites() != null) {
      System.out.println ("Other Sites:        [" + otherSites.size() + "]");
      for (long site : otherSites)
        System.out.println ("                     " + site);
    } else System.out.println ("Other Sites:        [-]");
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
   * @return the asinKeys
   */
  public List<String> getAsinKeys() {
    return asinKeys;
  }

  /**
   * @param asinKeys the asinKeys to set
   */
  public void setAsinKeys(List<String> asinKeys) {
    this.asinKeys = asinKeys;
  }

  /**
   * @return the otherSites
   */
  public List<Long> getOtherSites() {
    return otherSites;
  }

  /**
   * @param otherSites the otherSites to set
   */
  public void setOtherSites(List<Long> otherSites) {
    this.otherSites = otherSites;
  }
}
