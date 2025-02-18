package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleByD {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//sesssion -id -> one id 
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		
		String title = driver.getTitle();
		System.out.println(title);
		//convert set into list
		List<String> windowHandle=new ArrayList<String>(allwindow);
		
		//switch to child window
		driver.switchTo().window(windowHandle.get(1));
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.findElement(By.id("email")).sendKeys("Dilip@testleaf.com");
		
		//close the child window- current window
		driver.close(); //current window
		
		//switch back to parent window click another action
		driver.switchTo().window(windowHandle.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		driver.quit(); // all opened window/tab
	}

}
