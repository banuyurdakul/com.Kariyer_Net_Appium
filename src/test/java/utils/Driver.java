package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AndroidDriver driver;
    static final String TELEFONADI = "";
    static final String ANDROIDVERSION = "";
    static final String PLATFORM = "Android";
    static final String OTOMASYON_ISMI = "UiAutomator2";

    public static AndroidDriver getAndroidDriver() {

        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (driver == null) {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, TELEFONADI);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ANDROIDVERSION);
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, OTOMASYON_ISMI);
            caps.setCapability("appPackage", "");
            caps.setCapability("appActivity", "");
            caps.setCapability(MobileCapabilityType.NO_RESET, false);


            if (ConfigReader.getProperty("platformName").equals("Android")) {
                assert appiumServerURL != null;
                driver = new AndroidDriver<AndroidElement>(appiumServerURL, caps);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            } else {
                throw new UnsupportedOperationException("Invalid Platform Name");
            }

        }

        return driver;
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.closeApp();
            driver = null;
        }
    }
}