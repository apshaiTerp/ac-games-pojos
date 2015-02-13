package com.ac.games.data.mock;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

/**
 * @author ac010168
 * 
 * This class exists to mock up example XML output returned from the BGG XML API
 * so that we can simulate our parsing logic. 
 */
public class MockGameData {
  
  //This game tests the Collectible assignment
  public static final int BGG_MAGIC_THE_GATHERING = 0;
  //This game tests the Base game assignment (that has expansions)
  public static final int BGG_COSMIC_ENCOUNTER    = 1;
  //This game tests the Expansion assignment
  public static final int BGG_COSMIC_INCURSION    = 2;
  //This game tests the Base game assignment when the game is a standalone title (no expansions)
  public static final int BGG_ABYSS               = 3;
  //This game tests the Dice Masters game, which has not yet been released
  public static final int BGG_DC_DICE_MASTERS     = 4;
  //This game tests the return format of a game that doesn't exist
  public static final int BGG_NOT_FOUND           = 5;
  
  //This game tests the In Stock lookup
  public static final int CSI_ABYSS               = 10;
  //This game tests the PreOrder lookup
  public static final int CSI_COSMIC_ENCOUNTER    = 11;
  //This game tests the Out of Stock lookup
  public static final int CSI_COSMIC_INCURSION    = 12;
  //This game tests the Out of Stock - Not yet accepting PreOrders lookup
  public static final int CSI_DC_DICE_MASTERS     = 13;
  //This game tests the return format of a game that doesn't exist
  public static final int CSI_NOT_FOUND           = 14;
  
  //This game tests the In Stock lookup
  public static final int MM_ABYSS                = 20;
  //This game tests the Out of Stock lookup
  public static final int MM_COSMIC_ENCOUNTER     = 21;
  //This game also happens to be Out of Stock lookup
  public static final int MM_COSMIC_INCURSION     = 22;
  //This game is in a Pre-Order state and Out of Stock
  public static final int MM_DC_DICE_MASTERS      = 23;
  //This game is in a Pre-Order state and Orderable
  public static final int MM_XWING_IG2000         = 24;
  //This game tests the return format of a game that doesn't exist
  public static final int MM_NOT_FOUND            = 25;
  
  private final static MockGameData gameData = new MockGameData();
  
  public MockGameData() {}
  
  /**
   * Generate Content String based on a corresponding XML file.
   * 
   * @param gameFlag Constant flag that helps determine which file to load.
   * @return A String representing the content block
   */
  public static String generateContentString(int gameFlag) {
    try {
      switch (gameFlag) {
        case BGG_MAGIC_THE_GATHERING : return generateBggMagicTheGathering();
        case BGG_COSMIC_ENCOUNTER    : return generateBggCosmicEncounter();
        case BGG_COSMIC_INCURSION    : return generateBggCosmicIncursion();
        case BGG_ABYSS               : return generateBggAbyss();
        case BGG_DC_DICE_MASTERS     : return generateBggDCDiceMasters();
        case BGG_NOT_FOUND           : return generateBggNotFound();
        case CSI_ABYSS               : return generateCsiAbyss();
        case CSI_COSMIC_ENCOUNTER    : return generateCsiCosmicEncounter();
        case CSI_COSMIC_INCURSION    : return generateCsiCosmicIncursion();
        case CSI_DC_DICE_MASTERS     : return generateCsiDCDiceMasters();
        case CSI_NOT_FOUND           : return generateCsiNotFound();
        case MM_ABYSS                : return generateMMAbyss();
        case MM_COSMIC_ENCOUNTER     : return generateMMCosmicEncounter();
        case MM_COSMIC_INCURSION     : return generateMMCosmicIncursion();
        case MM_DC_DICE_MASTERS      : return generateMMDCDiceMasters();
        case MM_XWING_IG2000         : return generateMMXWingIG2000();
        case MM_NOT_FOUND            : return generateMMNotFound();
        default : return "";
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
      return "";
    }
  }
  
  private static String generateBggMagicTheGathering() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("bgg_magicthegathering.xml"));
  }
  
  private static String generateBggCosmicEncounter() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("bgg_cosmicencounter.xml"));
  }

  private static String generateBggCosmicIncursion() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("bgg_cosmicincursion.xml"));
  }

  private static String generateBggAbyss() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("bgg_abyss.xml"));
  }
  
  private static String generateBggDCDiceMasters() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("bgg_dcdicemasters.xml"));
  }
  
  private static String generateBggNotFound() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("bgg_notfound.xml"));
  }
  
  private static String generateCsiAbyss() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("csi_abyss.html"));
  }

  private static String generateCsiCosmicEncounter() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("csi_cosmicencounter.html"));
  }

  private static String generateCsiCosmicIncursion() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("csi_cosmicincursion.html"));
  }

  private static String generateCsiDCDiceMasters() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("csi_dcdicemasters.html"));
  }
  
  private static String generateCsiNotFound() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("csi_notfound.html"));
  }
  
  private static String generateMMAbyss() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("mm_abyss.html"));
  }

  private static String generateMMCosmicEncounter() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("mm_cosmicencounter.html"));
  }

  private static String generateMMCosmicIncursion() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("mm_cosmicincursion.html"));
  }

  private static String generateMMDCDiceMasters() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("mm_dcdicemasters.html"));
  }
  
  private static String generateMMXWingIG2000() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("mm_xwingig2000.html"));
  }

  private static String generateMMNotFound() throws IOException {
    return IOUtils.toString(gameData.getClass().getResourceAsStream("mm_notfound.html"));
  }
}
