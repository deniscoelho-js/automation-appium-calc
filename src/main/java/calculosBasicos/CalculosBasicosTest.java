package calculosBasicos;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculosBasicosTest {

    @Test
    public void calculosBasicos() throws MalformedURLException {
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

        MobileElement plus = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        plus.click();

        MobileElement num6 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
        num6.click();

        MobileElement result = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/result_preview"));

        System.out.println(result.getText());

        System.out.println("Soma");
        Assert.assertEquals("15", result.getText());

        MobileElement clear = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/clr"));
        clear.click();

        System.out.println("-----------------------------------");

        MobileElement num8 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
        num8.click();

        MobileElement sub = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_sub"));
        sub.click();

        MobileElement num2 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        num2.click();

        System.out.println("Sub");
        System.out.println(result.getText());

        Assert.assertEquals("6", result.getText());

        clear.click();

        System.out.println("-----------------------------------");

        MobileElement num7 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
        num7.click();

        MobileElement mul = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
        mul.click();

        MobileElement num3 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
        num3.click();

        System.out.println("Mult");
        System.out.println(result.getText());

        Assert.assertEquals("21", result.getText());

        clear.click();

        System.out.println("-----------------------------------");

        num8.click();

        MobileElement div = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_div"));
        div.click();

        num2.click();

        System.out.println("Div");
        System.out.println(result.getText());

        Assert.assertEquals("4", result.getText());

        clear.click();


        }
}
