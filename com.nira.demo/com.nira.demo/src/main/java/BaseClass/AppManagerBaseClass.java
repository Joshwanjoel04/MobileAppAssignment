package BaseClass;

//public class AppManagerBaseClass {

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AppManagerBaseClass {
    public static AndroidDriver<MobileElement> driver;
    public static Properties prop = new Properties();

    @BeforeClass
    public void setup() throws IOException {
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName"));
        caps.setCapability(MobileCapabilityType.APP, prop.getProperty("appPath"));
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        driver = new AndroidDriver<>(new URL(prop.getProperty("appiumServerURL")), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
} 
