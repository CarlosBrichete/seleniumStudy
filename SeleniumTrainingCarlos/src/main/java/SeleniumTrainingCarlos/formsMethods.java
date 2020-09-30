package SeleniumTrainingCarlos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formsMethods {
	
	WebDriver _driver;
	
	public formsMethods(WebDriver driver) {
		this._driver = driver;
	}
	
	public void clickSubmitButton() {
		_driver.findElement(By.xpath(formsKeys.getSubmitButton())).click();
	}
	
	public void succesfulMessage(String name, String date, String comment) {
		_driver.findElement(By.xpath(formsKeys.getNameField())).sendKeys(name);
		
		_driver.findElement(By.xpath(formsKeys.getDateField())).sendKeys(date);
			
		_driver.findElement(By.xpath(formsKeys.getCommentField())).sendKeys(comment);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		_driver.findElement(By.xpath(formsKeys.getSubmitButton())).click();
	}
}
