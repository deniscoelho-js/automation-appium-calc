package tela;

import driverFactory.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.By;
import java.net.MalformedURLException;

public class CalculadoraTela {

    public AndroidDriver driver;

    @Before
    public void iniciarAppium() throws MalformedURLException {
        driver = DriverFactory.getDriver();
    }

    MobileElement num9 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
    MobileElement soma = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_add"));
    MobileElement num6 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
    MobileElement resultado = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
    MobileElement limpar = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/clr"));
    MobileElement num8 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
    MobileElement sub = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_sub"));
    MobileElement num2 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
    MobileElement num7 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
    MobileElement mul = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
    MobileElement num3 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
    MobileElement div = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_div"));


    private CalculadoraTela tocarBotaoResultado(){
        resultado.click();
        return this;
    }

    private CalculadoraTela tocarBotaoLimpar(){
        limpar.click();
        return this;
    }

    private CalculadoraTela somarDoisValores(){
        num9.click();
        soma.click();
        num6.click();
        return this;
    }

    private CalculadoraTela subtrairDoisValores(){
        num8.click();
        sub.click();
        num2.click();
        return this;
    }

    private CalculadoraTela multiplicarDoisValores(){
        num7.click();
        mul.click();
        num3.click();
        return this;
    }

    private CalculadoraTela dividirDoisValores(){
        num8.click();
        div.click();
        num2.click();
        return this;
    }

    }

