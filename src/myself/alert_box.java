package myself;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_box {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Alert box coding started.. :)");
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.getTitle();
		String titleee = driver.getTitle();
		System.out.println("Title written as 1 _"+titleee);
		System.out.println("Title written as 2 _"+driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(2000);
		Alert alertbox= driver.switchTo().alert();
		String data= alertbox.getText();
		
		System.out.println("Alert box popping is.." +data);
	//	System.out.println("Alert box alertboxx is.." +alertbox);
		//System.out.println("Alert box driver is.." +driver);
		alertbox.accept();
		
		
		
		
		
	}

}
