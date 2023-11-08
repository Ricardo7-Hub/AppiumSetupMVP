package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.options.UiAutomator2Options;




public class GooglePlay_Test {
	public static void main(String[] args) throws InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("45C0220114000661");
         
        options.setCapability("appium:appPackage", "com.android.vending");
        options.setCapability("appium:appActivity", "com.android.vending.AssetBrowserActivity");
        options.setCapability("platformName", "Android");
        options.setCapability("appium:platformVersion", "11.0");
        options.setCapability("appium:automationName", "uiautomator2");
        //options.setCapability("noReset", "true");
        
        
		try {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText")).sendKeys("Dog");
			//Thread.sleep(1000);
			System.err.println(driver.isKeyboardShown());
			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.ENTER));
			//Thread.sleep(1000);
			
			//SELECCIONAR EL PRIMERO DE LA LISTA
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]")).click();
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Más resultados de Acerca de esta app\"]")).click();
			Thread.sleep(1000);
			driver.quit();
			
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
    }
}
