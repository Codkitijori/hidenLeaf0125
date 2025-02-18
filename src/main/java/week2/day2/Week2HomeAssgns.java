package week2.day2;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week2HomeAssgns {

	WebDriver driver;
	WebDriverWait wait;
	
	public Properties properties() throws IOException {

		Properties prop = new Properties();
		FileReader reader = new FileReader("./Properties/Data.properties");
		prop.load(reader);
		return prop;
		
	}
	
	public void assgnCheckBox() throws IOException, InterruptedException {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get(properties().getProperty("Leafground_chekBoxurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		
		// AJAX NOTIFICATION BUTTON
		WebElement notificationAjax = driver.findElement(By.xpath("//span[text()='Ajax']"));
		notificationAjax.click();
		boolean displayed = notificationAjax.isDisplayed();
		System.out.println("notification displayed :"+ displayed);  // how to print the text from the pop-up ??
		//Verify that the expected message is displayed. ??
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		
		// TRI-STATE CHECKBOX
		//h5[normalize-space()='Tri State Checkbox']
		//driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		WebElement triStateChkbox = driver.findElement(By.xpath("//h5[contains(text(),'Tri State')]/parent::div//div[2]"));
		triStateChkbox.click();
		if (triStateChkbox.isEnabled()) {
			String firstClickText = driver.findElement(By.xpath("//p[normalize-space()='State = 1']")).getText();
			System.out.println(firstClickText);
			triStateChkbox.click();
			String secondClickText = driver.findElement(By.xpath("//p[normalize-space()='State = 2']")).getText();
			System.out.println(secondClickText);
			triStateChkbox.click();
			String thirdClickText = driver.findElement(By.xpath("//p[normalize-space()='State = 0']")).getText();
			System.out.println(thirdClickText);
		}
		
		// TOGGLE-SWITCH
		WebElement toggleSwitchOn = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toggleSwitchOn.click();
		if (toggleSwitchOn.isEnabled()) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Checked']")));
			WebElement switchOnText = driver.findElement(By.xpath("//span[text()='Checked']"));
			System.out.println("text displayed ON :"+ switchOnText.getText());
			
			toggleSwitchOn.click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Unchecked']")));
			WebElement switchOffText = driver.findElement(By.xpath("//span[text()='Unchecked']"));
			System.out.println("text displayed OFF :"+ switchOffText.getText());
		}
		
		// DISABLED BUTTON
		boolean verifyDisabledCheckbox = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if (verifyDisabledCheckbox) {
			System.out.println("Checkbox is not enabled :" + verifyDisabledCheckbox);
		}
		
		// MULTI-SELECT DROPDOWN
		
		WebElement multiDropdown = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
		multiDropdown.click();
		
		String[] citiesToSelect = {"Miami", "Istanbul","Rome","Paris"};

		for (String city : citiesToSelect) {
		    driver.findElement(By.xpath("//ul[@role='group']//label[contains(text(),'" + city + "')]")).click();
		}
		
		// Retrieve selected options
        List<WebElement> selectedOptions = 
        		driver.findElements(By.xpath("//li[contains(@class,'ui-selectcheckboxmenu-token')]"));

        // Extract selected option text using for loop
        List<String> selectedTexts = new ArrayList<String>();
        for (WebElement option : selectedOptions) {
            selectedTexts.add(option.getText());
        }

        // Verification
        for (String city : citiesToSelect) {
            if (selectedTexts.contains(city)) {
                System.out.println(city + " is successfully selected.");
            } else {
                System.out.println(city + " selection failed.");
            }
        }
        
		driver.close();
	}
	
	public void assgnRadioBtn() throws IOException {

		driver = new ChromeDriver();
		driver.get(properties().getProperty("Leafground_radioBtnUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//TC1: Your most favorite browser
		String[] browserSelected = {"Chrome","Firefox","Safari"};
		for (int i = 0; i < browserSelected.length; i++) {
			System.out.println(browserSelected[i]);
			String browser = browserSelected[i];
			driver.findElement(By.xpath("(//label[text()='"+ browser +"'])[last()-1]")).click();
		}
		System.out.println("TC: Your most favorite browser : ENDS------------------------");
		
		//TC2: UnSelectable
		WebElement UnSelectBtn = driver.findElement(By.xpath("//label[text()='Chennai']"));
		System.out.println("CHENNAI-UnSelectBtn BEFORE first click [FALSE] : " + UnSelectBtn.isEnabled());
		if (!UnSelectBtn.isEnabled()) {
			UnSelectBtn.click();
			System.out.println("CHENNAI-UnSelectBtn AFTER first click [FALSE] : " + UnSelectBtn.isEnabled());
		}
		System.out.println("TC: UnSelectable : ENDS------------------------");
		
		//TC3: Find the default select radio button
		String[] defaultBrowsers = {"Edge","Chrome","Firefox","Safari"};
		for (int i =0; i < defaultBrowsers.length; i++) {
			String browser = defaultBrowsers[i];
			boolean selected = driver.findElement(By.xpath("(//label[text()='"+ browser +"'])[last()]")).isSelected();   //initially selected by default.
			System.out.println(browser + " selected value returned as : "+ selected);
			if(selected) {
				System.out.println(browser + " is selected by default.");
			}
		}
		System.out.println("TC: Find the default select radio button : ENDS------------------------");
		
		WebElement ageRadioBtn = driver.findElement(By.xpath("//label[contains(text(),'21-40')]"));
		boolean ageBtn = ageRadioBtn.isEnabled();
		System.out.println("ageBtn is : " + ageBtn);
		if(!ageBtn) {									// If ageBtn is true, the code inside the if block runs    <<<OR>>>     If ageBtn is false, the block is skipped.
			driver.findElement(By.xpath("//label[contains(text(),'21-40')]")).click();  
			System.out.println("Selected the age group: 21-40");
		} else {
			driver.findElement(By.xpath("//label[contains(text(),'41-60')]")).click();
			System.out.println("Selected the age group: 41-60");
		}
		
		//driver.close();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Week2HomeAssgns run = new Week2HomeAssgns();
		//run.assgnCheckBox();
		run.assgnRadioBtn();
		
	}
	
}

