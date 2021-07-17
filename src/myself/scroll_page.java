package myself;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_page {

	public static void main(String[] args) {
		
		System.out.println("scroll the page");
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.javatpoint.com/www.javatpoint.com");
		//driver.findElement(By.xpath(""));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 4500)"); 
		
		
//		driver.close();
		

	}

}
