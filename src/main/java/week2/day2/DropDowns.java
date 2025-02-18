package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.telerik.com/contact");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebDriverWait wd = new WebDriverWait(driver, 5);
		
		WebElement webEle1 = driver.findElement(By.id("Dropdown-1"));
		WebElement webEle2 = driver.findElement(By.id("Dropdown-2"));
		WebElement webEle3 = driver.findElement(By.id("Country-1"));
		WebElement firstname = driver.findElement(By.xpath("//input[@name='TextFieldController']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@id='Textbox-2']"));
		WebElement mail = driver.findElement(By.xpath("//input[@id='Email-1']"));
		WebElement companyName = driver.findElement(By.xpath("//input[@id='Textbox-3']"));
		WebElement phnNo = driver.findElement(By.xpath("//input[@name='TextFieldController_2']"));
		WebElement commentBox = driver.findElement(By.name("ParagraphTextFieldController"));
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));                   //tag[text()='']
		WebElement iAgreeChkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		//input[contains(@id,'user')]
		WebElement text = driver.findElement(By.xpath("//button[text()='Contact Us']"));   //div[contains(text(),'.NET Toolbox')]
		
		
		Select s1 = new Select(webEle1);
		Select s2 = new Select(webEle2);
		Thread.sleep(2000);
		Select s3 = new Select(webEle3);
		s1.selectByVisibleText("General Inquiries");
		s2.selectByIndex(10);
		s3.selectByValue("Canada");
		
		firstname.sendKeys("User");
		lastname.sendKeys("test");
		mail.sendKeys("abet7675@gmail.com");
		companyName.sendKeys("fireworks");
		phnNo.sendKeys("91191191100");
		commentBox.sendKeys("noComments");
		String text2 = text.getText();
		System.out.println(text2);
		iAgreeChkBox.click();
		btn.click();
		
//		driver.close();
	}

}
