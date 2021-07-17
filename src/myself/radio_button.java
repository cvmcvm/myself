package myself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) {
		
		System.out.println("Its radio button");
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='male']")).click();
		System.out.println("heyy");
		System.out.println("new line");
		

	}

}
