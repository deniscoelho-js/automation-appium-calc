package atualizacao;

import driverFactory.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Atualizacao {

    public AndroidDriver driver;
    @Before
    public void iniciarAppium() throws MalformedURLException {
        driver = DriverFactory.getDriver();
    }

    @Test
    public void testar() throws MalformedURLException {
        iniciarAppium();

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

