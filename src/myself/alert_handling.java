package myself;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling {

	public static void main(String[] args) {
		
		System.out.println("Alert handling started");
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.findElement(By.xpath("//button[@onclick'alert('hi, JavaTpoint Testing');']")).click();
		
		 Alert alert = (Alert) driver.switchTo().alert();  
		 
		 alert.accept();  
		 
		 
		
		

	}

}
