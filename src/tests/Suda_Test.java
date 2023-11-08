package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Suda_Test {
	public static void main(String[] args) throws InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("45C0220114000661");
         
        options.setCapability("appium:appPackage", "com.sudaoutdoors.sudaapp");
        options.setCapability("appium:appActivity", "com.sudaoutdoors.sudaapp.activities.HomeActivity");
        options.setCapability("platformName", "Android");
        options.setCapability("appium:platformVersion", "11.0");
        options.setCapability("appium:automationName", "uiautomator2");
        //options.setCapability("noReset", "true");
        

		try {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			
			Thread.sleep(5000);
			
			//BTN Next
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/mi_button_next")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/mi_button_next")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/mi_button_next")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/mi_button_next")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/mi_button_next")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/mi_button_back")).click();
			Thread.sleep(1000);
			
			//Registro
			
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/welcome_signup")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/btnAccept")).click();
			Thread.sleep(1000);
		
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/signup_username")).sendKeys("Usuario5");
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/signup_email")).sendKeys("email@testing5.cl");
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/signup_password")).sendKeys("Usuario123AA.");
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/signup_password_confirmation")).sendKeys("Usuario123AA.");
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/btnCreateAccount")).click();
			Thread.sleep(5000);
			
			//Permisos 
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(3000);
			
			//Navegación en la App
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/tab_icon")).click();  // Explorar
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/tvAdvancedSearch")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.sudaoutdoors.sudaapp:id/tvSelectedSports")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.CheckBox")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]")).click();
			

			Thread.sleep(5000);
			driver.quit();
			
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
    }
}
