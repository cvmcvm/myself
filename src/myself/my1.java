package myself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my1 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Its done");
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='gb_3 gb_4 gb_9d gb_3c']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shivam24sir@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")).click();
		
		
		
		
	}

}
