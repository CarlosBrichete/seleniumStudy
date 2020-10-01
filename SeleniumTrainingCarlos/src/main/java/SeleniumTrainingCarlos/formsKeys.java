package SeleniumTrainingCarlos;

import org.openqa.selenium.By;

public class formsKeys {
	public static By getNameFieldRequiredText() {
		return nameFieldRequiredText;
	}
	
	public static By getDateFieldRequiredText() {
		return dateFieldRequiredText;
	}
	
	public static By getCommentFieldRequiredText() {
		return commentFieldRequiredText;
	}
	
	public static By getPartyRockText() {
		return partyRockText;
	}
	
	public static By getSuccesfulMessage() {
		return succesfulMessage;
	}
	
	public static By getSubmitButton() {
		return submitButton;
	}

	public static By getNameField() {
		return nameField;
	}
	public static By getDateField() {
		return dateField;
	}
	
	public static By getCommentField() {
		return commentField;
	}
	
	public static By getRandomDate() {
		return randomDate;
	}
	
	private static By nameFieldRequiredText = By.xpath("//*[contains(@data-field-name, 'Name')]//*[contains(@class, 'help-block')]");
	private static By dateFieldRequiredText = By.xpath("//*[contains(@data-field-name, 'Date')]//*[contains(@class, 'help-block')]");
	private static By commentFieldRequiredText = By.xpath("//*[contains(@data-field-name, 'Join')]//*[contains(@class, 'help-block')]");
	private static By partyRockText = By.xpath("//*[contains(@class, 'lfr-ddm-form-page-description')]");
	private static By succesfulMessage = By.xpath("//*[contains(@class, 'ddm-form-description')]");
	private static By submitButton = By.xpath("//*[contains(@class, 'btn-primary lfr-ddm-form-submit')]");
	private static By nameField = By.xpath("//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhatIsYourName')]");
	private static By dateField = By.xpath("//*[contains(@class, 'form-control input-group-inset input-group-inset-after')]");
	private static By commentField = By.xpath("//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhyDidYouJoin')]");
	private static By randomDate = By.xpath("//*[contains(@arialabel, '2020 9 14')]");
}
