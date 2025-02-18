package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static Alert alrt(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement promptAlert = driver.findElement(By.xpath("//h5[contains(text(),'Prompt')]/parent::div//span[text()='Show']"));
		promptAlert.click();
		alrt(driver).sendKeys("textZero");
		alrt(driver).accept();
	}

	

}
