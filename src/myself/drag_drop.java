package myself;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		 
		System.out.println("dragging started");
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement from=driver.findElement(By.id("sourceImage"));
		//driver.findElement(By.xpath("//img[@id='sourceImage']"));
		
		//WebElement from= driver.findElement(By.xpath("//img[@id='sourceImage']"));
		
		WebElement to =driver.findElement(By.id("targetDiv"));
		//driver.findElement(By.xpath("//div[@id='targetDiv']"));
		
		//WebElement to = driver.findElement(By.xpath("//div[@id='targetDiv']"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(from,to).build().perform();
		System.out.println("program closed");
		
		
		
		
		
	}

}
