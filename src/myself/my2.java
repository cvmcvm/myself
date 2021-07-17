package myself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class my2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Job started");
		
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\myself\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\myself\\Driver\\chromedriver.exe");
		//webDriver driver = new ChromeDriver();
		
		WebDriver driver= new ChromeDriver();
		
	//	driver.get("https://www.shadi.com/");
		
	//	Thread.sleep(1000);
		driver.navigate().to("https://www.shadi.com/");
		
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//select[@id='dob_m']")).click();
		WebElement mahina= driver.findElement(By.xpath("//select[@id='dob_m']"));
		Select maah= new Select(mahina);   
		Thread.sleep(1000);
		maah.selectByIndex(03);
		Thread.sleep(1000);
		maah.selectByValue("05");
		Thread.sleep(1000);
		maah.selectByVisibleText("Apr");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//select[@id='dob_d']")).click();
		WebElement din= driver.findElement(By.xpath("//select[@id='dob_d']"));
		Select dinn= new Select(din);
		Thread.sleep(1000);
		dinn.selectByValue("05");
		//Thread.sleep(1000);
		//dinn.deselectByIndex(11);
		//Thread.sleep(1000);
	//	dinn.deselectByVisibleText("");
		
		driver.findElement(By.xpath("//select[@id='dob_y']"));
		//WebElement saal= sele driver.findElement(By.xpath("//select[@id='dob_y']"));
		Thread.sleep(1000);
		Select saal= new Select(driver.findElement(By.xpath("//select[@id='dob_y']")));
		saal.selectByVisibleText("2000");
		
		
		
	
		driver.close();
		
		
		

	}

}
