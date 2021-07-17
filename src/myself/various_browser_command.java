package myself;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class various_browser_command {

	public static void main(String[] args) {
		
		System.out.println("Various different commands are checked here...ok dear");
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://fast.com/");
		
		

	}

}
