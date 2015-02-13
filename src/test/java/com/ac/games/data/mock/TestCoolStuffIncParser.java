package com.ac.games.data.mock;

import org.junit.Test;

import com.ac.games.data.CoolStuffIncPriceData;
import com.ac.games.data.parser.CoolStuffIncParser;

import junit.framework.TestCase;

/**
 * @author ac010168
 *
 */
public class TestCoolStuffIncParser extends TestCase {

  //http://www.coolstuffinc.com/p/203495
  public final static long ABYSS_GAME_ID = 203495L;
  //http://www.coolstuffinc.com/p/136975
  public final static long COSMIC_ENCOUNTER_ID = 136975L;
  //http://www.coolstuffinc.com/p/136978
  public final static long COSMIC_INCURSION_ID = 136978L;
  //http://www.coolstuffinc.com/p/207653
  public final static long DC_DICE_MASTERS_ID  = 207653L;
  
  @Test
  public void testAbyssParser() {
    System.out.println ("Launching Test testAbyssParser()!");

    String htmlContent = MockGameData.generateContentString(MockGameData.CSI_ABYSS);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing Abyss...");
    System.out.println ("------------------------------------------------------");
    
    CoolStuffIncPriceData data = new CoolStuffIncPriceData();
    try {
      data = CoolStuffIncParser.parseCSIHTML(htmlContent, ABYSS_GAME_ID);
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

    String htmlContent = MockGameData.generateContentString(MockGameData.CSI_COSMIC_ENCOUNTER);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing Cosmic Encounter...");
    System.out.println ("------------------------------------------------------");
    
    CoolStuffIncPriceData data = new CoolStuffIncPriceData();
    try {
      data = CoolStuffIncParser.parseCSIHTML(htmlContent, COSMIC_ENCOUNTER_ID);
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

    String htmlContent = MockGameData.generateContentString(MockGameData.CSI_COSMIC_INCURSION);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing Cosmic Incursion...");
    System.out.println ("------------------------------------------------------");
    
    CoolStuffIncPriceData data = new CoolStuffIncPriceData();
    try {
      data = CoolStuffIncParser.parseCSIHTML(htmlContent, COSMIC_INCURSION_ID);
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

    String htmlContent = MockGameData.generateContentString(MockGameData.CSI_DC_DICE_MASTERS);
    
    System.out.println ("------------------------------------------------------");
    //System.out.println (htmlContent);
    System.out.println ("Processing DC Dice Masters...");
    System.out.println ("------------------------------------------------------");
    
    CoolStuffIncPriceData data = new CoolStuffIncPriceData();
    try {
      data = CoolStuffIncParser.parseCSIHTML(htmlContent, DC_DICE_MASTERS_ID);
      data.printContentsForDebug();
    } catch (Throwable t) {
      t.printStackTrace();
      fail("Should not throw errors: " + t.getMessage());
    }
    
    assertTrue("The world didn't end during this test", true);
  }
}
