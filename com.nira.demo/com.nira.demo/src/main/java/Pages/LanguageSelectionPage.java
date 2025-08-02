package Pages;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import utils.MobileActions;

public class LanguageSelectionPage extends MobileActions {
    AndroidDriver<MobileElement> driver;
    MobileActions action;

    By hindiOption = By.id("com.nirafinance.customer:id/vHindi");
    By englishOption = By.id("com.nirafinance.customer:id/vEnglish");
    By kannadaOption = By.id("com.nirafinance.customer:id/vKannada");
    By okButton = By.id("com.nirafinance.customer:id/button_ln_confirm");

    public LanguageSelectionPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        action = new MobileActions(driver);
    }

    public void selectLanguage(String language) {
        switch (language.toLowerCase()) {
            case "hindi":
                action.click(hindiOption);
                break;
            case "kannada":
                action.click(kannadaOption);
                break;
            default:
                action.click(englishOption);
        }
    }

    public void confirmSelection() {
        action.click(okButton);
    }
}
