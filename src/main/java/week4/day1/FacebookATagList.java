package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookATagList {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> aTagElements = driver.findElements(By.tagName("a"));
		
		int sizeOfaTagEle = aTagElements.size();
		System.out.println(sizeOfaTagEle);
		
		for (int i = 0; i < aTagElements.size(); i++) {
			
			String text = aTagElements.get(i).getText();
			System.out.println(text);

		}
		
		
	}

}
