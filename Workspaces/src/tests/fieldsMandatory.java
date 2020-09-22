package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;

public class fieldsMandatory {
	static WebDriver driver = new ChromeDriver();
	
	public static final String nameFieldRequiredText = driver.findElement(By.xpath("//*[contains(@class, 'form-feedback-item help-block')]")).getText();
	
	public static final String dateFieldRequiredText = driver.findElement(By.xpath("//*[contains(@class, 'form-feedback-item help-block')]")).getText();
	
	public static final String commentFieldRequiredText = driver.findElement(By.xpath("//*[contains(@class, 'form-feedback-item help-block')]")).getText();

	public static final String expectedMandatoryMessage = "This field is required.";
	
	public static final String partyRockText = driver.findElement(By.xpath("//*[contains(@class, 'lfr-ddm-form-page-description')]")).getText();
	
	public static final String expectedPartyRockMessage = "Let's party rock.";
	
	public static final String name="Carlos";
	
	public static final String date="08/10/1990";
	
	public static final String comment="I like to find bugs";
	
	public static final String succesfulMessage = driver.findElement(By.xpath("//*[contains(@class, 'ddm-form-description')]")).getText();
	
	public static final String expectedSuccesfulMessage = "Information sent successfully!";

	@Test
	public void mandatoryFields() {
		// Open the web browser
		System.setProperty("webdriver.chrome.driver", "/Users/cbrichete/Desktop/Selenium/Software/chromedriver");
			
		WebDriver driver = new ChromeDriver();
			
		// Navigate to the web
		driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
			
		driver.findElement(By.xpath("//*[contains(@class, 'btn btn-primary lfr-ddm-form-submit pull-right')]")).click();

		Assert.assertTrue(nameFieldRequiredText.contains(expectedMandatoryMessage));
			
		Assert.assertTrue(dateFieldRequiredText.contains(expectedMandatoryMessage));
			
		Assert.assertTrue(commentFieldRequiredText.contains(expectedMandatoryMessage));
		
		System.out.println("Test passed");
		
		driver.close();
	}
		
	@Test
	public void textPresent() {
		// Open the web browser
		System.setProperty("webdriver.chrome.driver", "/Users/cbrichete/Desktop/Selenium/Software/chromedriver");
					
		WebDriver driver = new ChromeDriver();
					
		// Navigate to the web
		driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
				
		Assert.assertTrue(nameFieldRequiredText.contains(expectedPartyRockMessage));
		
		System.out.println("Test passed");
		
		driver.close();	
	}

	@Test
	public void successfulSubmit() {
		// Open the web browser
		System.setProperty("webdriver.chrome.driver", "/Users/cbrichete/Desktop/Selenium/Software/chromedriver");
					
		WebDriver driver = new ChromeDriver();
					
		// Navigate to the web
		driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
		
		driver.findElement(By.xpath("//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhatIsYourName')]")).click();
			
		driver.findElement(By.xpath("//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhatIsYourName')]")).sendKeys(name);
			
		driver.findElement(By.xpath("//*[contains(@class, 'form-control input-group-inset input-group-inset-after')]")).click();
			
		driver.findElement(By.xpath("//*[contains(@class, 'form-control input-group-inset input-group-inset-after')]")).sendKeys(date);
			
		driver.findElement(By.xpath("//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhyDidYouJoin')]")).click();
			
		driver.findElement(By.xpath("//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhyDidYouJoin')]")).sendKeys(comment);
			
		driver.findElement(By.xpath("//*[contains(@class, 'btn btn-primary lfr-ddm-form-submit pull-right')]")).click();
			
		Assert.assertTrue(succesfulMessage.contains(expectedSuccesfulMessage));
		
		System.out.println("Test passed");
		
		driver.close();	
	}
}


