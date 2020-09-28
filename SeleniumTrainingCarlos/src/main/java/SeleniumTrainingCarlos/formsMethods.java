package SeleniumTrainingCarlos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formsMethods {
	static WebDriver driver = new ChromeDriver();
	
	static formsKeys fk = new formsKeys();
	
	public static void clickSubmitButton() {
		driver.findElement(By.xpath(fk.getSubmitButton())).click();
	}
	
	public static void succesfulMessage(String name, String date, String comment) {
		driver.findElement(By.xpath(fk.getNameField())).click();
		
		driver.findElement(By.xpath(fk.getNameField())).sendKeys(name);
			
		driver.findElement(By.xpath(fk.getDateField())).click();
			
		driver.findElement(By.xpath(fk.getDateField())).sendKeys(date);
			
		driver.findElement(By.xpath(fk.getCommentField())).click();
			
		driver.findElement(By.xpath(fk.getCommentField())).sendKeys(comment);
			
		driver.findElement(By.xpath(fk.getSubmitButton())).click();
	}
}
