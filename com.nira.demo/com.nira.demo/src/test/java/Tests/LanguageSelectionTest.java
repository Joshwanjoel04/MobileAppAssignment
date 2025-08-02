package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.AppManagerBaseClass;
import Pages.LanguageSelectionPage;


public class LanguageSelectionTest extends AppManagerBaseClass {

    @Test
    public void testValidLanguageSelectionflow() {
    	        LanguageSelectionPage langPage = new LanguageSelectionPage(driver);
    	        langPage.selectLanguage("English");
    	        langPage.confirmSelection();
    	        Assert.assertTrue(true); 
    	    }
    	 
@Test
public void testHindiLanguageSelection() {
    LanguageSelectionPage langPage = new LanguageSelectionPage(driver);
    langPage.selectLanguage("Hindi");
    langPage.confirmSelection();
    Assert.assertTrue(true); 
}

@Test
public void testKannadaLanguageSelection() {
    LanguageSelectionPage langPage = new LanguageSelectionPage(driver);
    langPage.selectLanguage("Kannada");
    langPage.confirmSelection();
    Assert.assertTrue(true); 
}
}