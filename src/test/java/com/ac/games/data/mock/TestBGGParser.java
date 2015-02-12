package com.ac.games.data.mock;

import org.junit.Test;

import com.ac.games.data.BGGGame;
import com.ac.games.data.parser.BGGGameParser;

import junit.framework.TestCase;

/**
 * @author ac010168
 *
 */
public class TestBGGParser extends TestCase {
  
  public final static long ABYSS_GAME_ID               = 155987L;
  public final static long COSMIC_ENCOUNTER_GAME_ID    = 39463L;
  public final static long COSMIC_INCURSION_GAME_ID    = 61001L;
  public final static long MAGIC_THE_GATHERING_GAME_ID = 463L;
  public final static long DC_DICE_MASTERS_GAME_ID     = 138649L;

  @Test
  public void testAbyssParser() {
    System.out.println ("Launching Test testAbyssParser()!");
    
    String xmlContent = MockGameData.generateContentString(MockGameData.BGG_ABYSS);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (xmlContent);
    System.out.println ("Processing Abyss...");
    System.out.println ("------------------------------------------------------");
    
    BGGGame game = null;
    try {
      game = BGGGameParser.parseBGGXML(xmlContent);
      game.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }
  
  @Test
  public void testCosmicEncounterParser() {
    System.out.println ("Launching Test testCosmicEncounterParser()!");

    String xmlContent = MockGameData.generateContentString(MockGameData.BGG_COSMIC_ENCOUNTER);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (xmlContent);
    System.out.println ("Processing Cosmic Encounter...");
    System.out.println ("------------------------------------------------------");
    
    BGGGame game = null;
    try {
      game = BGGGameParser.parseBGGXML(xmlContent);
      game.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }

  @Test
  public void testCosmicIncursionParser() {
    System.out.println ("Launching Test testCosmicIncursionParser()!");

    String xmlContent = MockGameData.generateContentString(MockGameData.BGG_COSMIC_INCURSION);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (xmlContent);
    System.out.println ("Processing Cosmic Incursion...");
    System.out.println ("------------------------------------------------------");
    
    BGGGame game = null;
    try {
      game = BGGGameParser.parseBGGXML(xmlContent);
      game.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }

  @Test
  public void testMagicTheGatheringParser() {
    System.out.println ("Launching Test testMagicTheGatheringParser()!");

    String xmlContent = MockGameData.generateContentString(MockGameData.BGG_MAGIC_THE_GATHERING);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (xmlContent);
    System.out.println ("Processing Magic the Gathering...");
    System.out.println ("------------------------------------------------------");
    
    BGGGame game = null;
    try {
      game = BGGGameParser.parseBGGXML(xmlContent);
      game.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }

  @Test
  public void testDCDiceMastersParser() {
    System.out.println ("Launching Test testDCDiceMastersParser()!");

    String xmlContent = MockGameData.generateContentString(MockGameData.BGG_DC_DICE_MASTERS);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (xmlContent);
    System.out.println ("Processing DC Dice Masters...");
    System.out.println ("------------------------------------------------------");
    
    BGGGame game = null;
    try {
      game = BGGGameParser.parseBGGXML(xmlContent);
      game.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }
}
