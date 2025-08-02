package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;

import utils.MobileActions;

public class EmiCalculatorPage extends MobileActions {
	{
	    AndroidDriver  driver;
	    MobileActions action;

	    By loanAmountSeekBar = By.id("com.nirafinance.customer:id/amountSeekBar");
	    By tenureSeekBar = By.id("com.nirafinance.customer:id/tenorSeekBar");
	    By emiValue = By.xpath("//android.widget.TextView[@resource-id='com.nirafinance.customer:id/text_interest']/following-sibling::*[1]");

	    public EmiCalculatorPage(AndroidDriver driver) {
	        this.driver = driver;
	        action = new MobileActions(driver);
	    }

	    public void slideLoanAmount(int offsetStart, int offsetEnd) {
	        Action.slideSeekBar(loanAmountSeekBar, offsetStart, offsetEnd);
	    }

	    public void slideTenure(int offsetStart, int offsetEnd) {
	        action.slideSeekBar(tenureSeekBar, offsetStart, offsetEnd);
	    }

	    public String getEmiValue() {
	        return action.getText(emiValue);
	    }
}