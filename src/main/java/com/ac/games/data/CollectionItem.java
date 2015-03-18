package com.ac.games.data;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author ac010168
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CollectionItem {
  
  /** The itemID for this collection item */
  private long             itemID;
  /** The gameID of the game that this item represents */
  private long             gameID;
  /** The reference to the game object we want */
  private Game             game;
  /** The list of custom weights assigned by the user to this game */
  private List<GameWeight> weights;
  /** The date the user acquired this game */
  private Date             dateAcquired;
  /** The date when this game was acquired */
  private String           whereAcquired;
  
  //TODO - There will be some fields that can be customized here
  
  public CollectionItem() {
    itemID        = -1;
    gameID        = -1;
    game          = null;
    weights       = null;
    dateAcquired  = null;
    whereAcquired = null;
  }
  
  public CollectionItem(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      CollectionItem jsonData = mapper.readValue(jsonString, CollectionItem.class);
      itemID        = jsonData.itemID;
      gameID        = jsonData.gameID;
      game          = jsonData.game;
      weights       = jsonData.weights;
      dateAcquired  = jsonData.dateAcquired;
      whereAcquired = jsonData.whereAcquired;
    } catch (JsonParseException jpe) {
      jpe.printStackTrace();
    } catch (JsonMappingException jme) {
      jme.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }

  /**
   * @return the itemID
   */
  public long getItemID() {
    return itemID;
  }

  /**
   * @param itemID the itemID to set
   */
  public void setItemID(long itemID) {
    this.itemID = itemID;
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
   * @return the weights
   */
  public List<GameWeight> getWeights() {
    return weights;
  }

  /**
   * @param weights the weights to set
   */
  public void setWeights(List<GameWeight> weights) {
    this.weights = weights;
  }

  /**
   * @return the dateAcquired
   */
  public Date getDateAcquired() {
    return dateAcquired;
  }

  /**
   * @param dateAcquired the dateAcquired to set
   */
  public void setDateAcquired(Date dateAcquired) {
    this.dateAcquired = dateAcquired;
  }

  /**
   * @return the whereAcquired
   */
  public String getWhereAcquired() {
    return whereAcquired;
  }

  /**
   * @param whereAcquired the whereAcquired to set
   */
  public void setWhereAcquired(String whereAcquired) {
    this.whereAcquired = whereAcquired;
  }

  /**
   * @return the game
   */
  public Game getGame() {
    return game;
  }

  /**
   * @param game the game to set
   */
  public void setGame(Game game) {
    this.game = game;
  }
}
