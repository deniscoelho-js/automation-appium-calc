package br.com.automation.appium.calc;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCalc {

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:app", "/Users/user/Documents/Java/Calculator_v8.2 (453324893)_apkpure.com.apk");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:platformVersion", "11");
        desiredCapabilities.setCapability("appium:deviceName", "pixel-4");
        desiredCapabilities.setCapability("appium:automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);


        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), desiredCapabilities);


        MobileElement num9 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
        num9.click();

        MobileElement num6 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
        num6.click();

        driver.quit();
    }
}
