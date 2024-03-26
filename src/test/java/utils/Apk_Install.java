package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Apk_Install {

    AndroidDriver<AndroidElement> driver;


    @Test
    public void apk_Install() throws MalformedURLException {

        final String deviceName = "Pixel 2";
        final String platformVersion = "10.0";
        final String platformName = "Android";
        final String autamationName = "UiAutomator2";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,autamationName);
        caps.setCapability(MobileCapabilityType.APP,ConfigReader.getProperty("apkFile"));
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);





    }


}
