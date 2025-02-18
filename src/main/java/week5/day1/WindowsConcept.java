package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsConcept {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Test@2025");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Learn More')]")).click();
		
		//driver.switchTo().window(nameOrHandle);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		
		String title = driver.getTitle();
		System.out.println(title);
		//convert set into list
		List<String> windowHandle=new ArrayList<String>(allwindow);
		System.out.println("windowHandle values : "+ windowHandle);
		
		//switch to child window
		driver.switchTo().window(windowHandle.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String childPage = driver.getTitle();
		System.out.println("childPage :" + childPage);
		
		driver.switchTo().window(windowHandle.get(0));
		String parentPage = driver.getTitle();
		System.out.println("parentPage :" + parentPage);
		
		driver.close();
		driver.quit();
		
		
	}

}
