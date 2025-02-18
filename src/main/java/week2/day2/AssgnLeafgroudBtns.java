package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnLeafgroudBtns {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("DAshboard")) {
			System.out.println("webPage title is : " + title);
		}
		
		driver.navigate().back();
		//button[@type='button' and @disabled='disabled']
		//h5[text()='Confirm if the button is disabled.']
		boolean enabled = driver.findElement(By.xpath("//button[@type='button' and @disabled='disabled']")).isEnabled();
		System.out.println(enabled);
		
		Point buttonLocation = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']")).getLocation();
		System.out.println("position of the Submit button location : " + buttonLocation);
		
		String rgbaColor = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/parent::div/button")).getCssValue("background-color");
		//span[@class='ui-button-text ui-c' and text()='Save']
		System.out.println("'Save' button background-color : " + rgbaColor);
		
		Dimension size = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']")).getSize();
		System.out.println("Button height and width : "+ size);
		
		driver.close();
		
		
		
		
		
	}

}
