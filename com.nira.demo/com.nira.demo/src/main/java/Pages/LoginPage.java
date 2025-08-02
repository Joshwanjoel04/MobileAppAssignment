package Pages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utils.MobileActions;

public class LoginPage extends MobileActions{
    AndroidDriver<MobileElement> driver;
    MobileActions action;

    By mobileInput = By.id("mobile_input");
    By getOtpButton = By.id("get_otp_button");
    By errorText = By.id("mobile_error_text");
    AndroidDriver<MobileElement> driver;
    MobileActions action;

    By mobileInput = By.xpath("//android.widget.TextView[@resource-id='com.nirafinance.customer:id/tvInputTitle']/following-sibling::*[1]");
    By getOtpButton = By.id("com.nirafinance.customer:id/otpSubmit");
    

    	    public LoginPage(AndroidDriver<MobileElement> driver) {
    	        this.driver = driver;
    	        action = new MobileActions(driver);
    	    }

    	    public void enterPhoneNumber(String number) {
    	        action.sendKeys(mobileInput, number);
    	    }

    	    public void tapGetOtp() {
    	        action.click(getOtpButton);
    	    }
    	}
}
