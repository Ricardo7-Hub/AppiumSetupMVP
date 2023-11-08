package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Calculadora_Test {
	public static void main(String[] args) {
        
        UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("45C0220114000661");
         
        options.setCapability("appium:appPackage", "com.huawei.calculator");
        options.setCapability("appium:appActivity", "com.huawei.calculator.Calculator");
        options.setCapability("platformName", "Android");
        options.setCapability("appium:platformVersion", "11.0");
        options.setCapability("appium:automationName", "uiautomator2");
         
        try {
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            
            //Realizar suma
            driver.findElement(By.id("com.huawei.calculator:id/digit_7")).click();
            driver.findElement(By.id("com.huawei.calculator:id/digit_0")).click();
            driver.findElement(By.id("com.huawei.calculator:id/op_add")).click();
            driver.findElement(By.id("com.huawei.calculator:id/digit_3")).click();
            driver.findElement(By.id("com.huawei.calculator:id/digit_0")).click();
            driver.findElement(By.id("com.huawei.calculator:id/eq")).click();
            driver.quit();
            
            
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
