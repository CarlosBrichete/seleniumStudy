package SeleniumTrainingCarlos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formsMethods {

	WebDriver _driver;
	WebDriverWait wait;

	public formsMethods(WebDriver driver) {
		this._driver = driver;
		this.wait = new WebDriverWait(_driver, 5);
	}

	public void clickSubmitButton(By locator) {
		waitElementBePresence(locator);
		waitElementBeVisible(locator);
		waitElementBeClickable(locator);

		_driver.findElement(formsKeys.getSubmitButton()).click();
		
		fixError();
	}

	public void succesfulMessage(String name, String date, String comment, By locator) {
		fillName(name, locator);
		fillDate(locator);
		fillComment(comment, locator);

		fixError();
		
		clickSubmitButton(locator);

		fixError();
	}

	public void fillName(String name, By locator) {
		waitElementBePresence(locator);
		waitElementBeVisible(locator);
		waitElementBeClickable(locator);

		_driver.findElement(formsKeys.getNameField()).sendKeys(name);

		fixError();
	}

	public void fillDate(By locator) {
		waitElementBePresence(locator);
		waitElementBeVisible(locator);
		waitElementBeClickable(locator);

		_driver.findElement(formsKeys.getDateField()).click();
		_driver.findElement(formsKeys.getRandomDate()).click();

		fixError();
	}

	public void fillComment(String comment, By locator) {
		waitElementBePresence(locator);
		waitElementBeVisible(locator);
		waitElementBeClickable(locator);

		_driver.findElement(formsKeys.getCommentField()).sendKeys(comment);

		fixError();
	}

	public void waitElementBeClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void waitElementBeVisible(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitElementBePresence(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	private void fixError() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
