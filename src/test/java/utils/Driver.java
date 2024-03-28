package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AndroidDriver driver;
    static final String deviceName = ConfigReader.getProperty("deviceName");
    static final String androidVersion = ConfigReader.getProperty("androidVersion");
    static final String platformName = ConfigReader.getProperty("platformName");
    static final String automationName = ConfigReader.getProperty("automationName");

    public static AndroidDriver getAndroidDriver() {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (driver == null) {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidVersion);
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
            caps.setCapability("appPackage", "com.kariyer.androidproject");
            caps.setCapability("appActivity","com.kariyer.androidproject.ui.login.LoginActivity");
            caps.setCapability(MobileCapabilityType.NO_RESET, false);

            if (ConfigReader.getProperty("platformName").equals("Android")) {
                assert appiumServerURL != null;
                driver = new AndroidDriver<>(appiumServerURL, caps);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            } else {

                throw new UnsupportedOperationException("Invalid Platform Name ");

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