package myself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_button {

	public static void main(String[] args) {
		
		System.out.println("to click checkbox button");
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='Performance']")).click();
		

	}

}
