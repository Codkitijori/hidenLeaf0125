package week2.day2;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccAssgn {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver(); // Initialize the WebDriver
		FileReader reader = new FileReader("./Properties/Data.properties");
		Properties prop = new Properties();
		prop.load(reader);

		driver.get(prop.getProperty("Leaftaps_url")); // Load the URL
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Usr: Demosalesmanager pwd: crmsfa
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("validUsr"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validPwd"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("lop Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("40");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String title = driver.getTitle();
        System.out.println(title);
		boolean contains = driver.getTitle().contains("Account Details | opentaps CRM");
		System.out.println(contains);
		
		Thread.sleep(4000);
		driver.close();
		

	}

}
