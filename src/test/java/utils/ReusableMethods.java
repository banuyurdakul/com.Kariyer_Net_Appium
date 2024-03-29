package utils;


import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ReusableMethods {

    static TouchAction action = new TouchAction<>(Driver.getAndroidDriver());






    public static void clickOn(int x, int y, int period) throws InterruptedException {
        action.press(PointOption.point(x,y)).release().perform();
        Thread.sleep(period);
    }


    public static void scrollDown(int period){
        action.press(PointOption.point(471,1371))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(period*1000)))
                .moveTo(PointOption.point(471,187))
                .release()
                .perform();
    }

    public static void scrollUp(int period) {
        action.press(PointOption.point(471,187))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(period*1000)))
                .moveTo(PointOption.point(471,1371))
                .release()
                .perform();
    }

    public static String getScreenShot(String fileName) throws IOException {

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot)Driver.getAndroidDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + fileName + date + ".png";
        File finalDestination = new File(target);
        FileUtils.copyFile(source, finalDestination);
        return target;


    }

    public static void wait(int seconds ){

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }




}
