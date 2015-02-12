package com.ac.games.data.mock;

import org.junit.Test;

import com.ac.games.data.MiniatureMarketPriceData;
import com.ac.games.data.parser.MiniatureMarketParser;

import junit.framework.TestCase;

/**
 * @author ac010168
 *
 */
public class TestMiniatureMarketParser extends TestCase {

  @Test
  public void testAbyssParser() {
    System.out.println ("Launching Test testAbyssParser()!");

    String htmlContent = MockGameData.generateContentString(MockGameData.MM_ABYSS);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing Abyss...");
    System.out.println ("------------------------------------------------------");
    
    MiniatureMarketPriceData data = new MiniatureMarketPriceData();
    try {
      data = MiniatureMarketParser.parseMMHTML(htmlContent);
      data.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }

  @Test
  public void testCosmicEncounterParser() {
    System.out.println ("Launching Test testCosmicEncounterParser()!");

    String htmlContent = MockGameData.generateContentString(MockGameData.MM_COSMIC_ENCOUNTER);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing Cosmic Encounter...");
    System.out.println ("------------------------------------------------------");
    
    MiniatureMarketPriceData data = new MiniatureMarketPriceData();
    try {
      data = MiniatureMarketParser.parseMMHTML(htmlContent);
      data.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }

  @Test
  public void testCosmicIncursionParser() {
    System.out.println ("Launching Test testCosmicIncursionParser()!");

    String htmlContent = MockGameData.generateContentString(MockGameData.MM_COSMIC_INCURSION);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing Cosmic Incursion...");
    System.out.println ("------------------------------------------------------");
    
    MiniatureMarketPriceData data = new MiniatureMarketPriceData();
    try {
      data = MiniatureMarketParser.parseMMHTML(htmlContent);
      data.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }

  @Test
  public void testDCDiceMastersParser() {
    System.out.println ("Launching Test testDCDiceMastersParser()!");

    String htmlContent = MockGameData.generateContentString(MockGameData.MM_DC_DICE_MASTERS);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing DC Dice Masters...");
    System.out.println ("------------------------------------------------------");
    
    MiniatureMarketPriceData data = new MiniatureMarketPriceData();
    try {
      data = MiniatureMarketParser.parseMMHTML(htmlContent);
      data.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }

  @Test
  public void testXWingIG2000Parser() {
    System.out.println ("Launching Test testXWingIG2000Parser()!");

    String htmlContent = MockGameData.generateContentString(MockGameData.MM_XWING_IG2000);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing XWing IG2000...");
    System.out.println ("------------------------------------------------------");
    
    MiniatureMarketPriceData data = new MiniatureMarketPriceData();
    try {
      data = MiniatureMarketParser.parseMMHTML(htmlContent);
      data.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }
}
