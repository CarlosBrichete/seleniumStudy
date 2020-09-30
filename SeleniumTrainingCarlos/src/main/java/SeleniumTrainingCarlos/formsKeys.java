package SeleniumTrainingCarlos;

public class formsKeys {
	public static String getNameFieldRequiredText() {
		return nameFieldRequiredText;
	}
	
	public static String getDateFieldRequiredText() {
		return dateFieldRequiredText;
	}
	
	public static String getCommentFieldRequiredText() {
		return commentFieldRequiredText;
	}
	
	public static String getPartyRockText() {
		return partyRockText;
	}
	
	public static String getSuccesfulMessage() {
		return succesfulMessage;
	}
	
	public static String getSubmitButton() {
		return submitButton;
	}

	public static String getNameField() {
		return nameField;
	}
	public static String getDateField() {
		return dateField;
	}
	
	public static String getCommentField() {
		return commentField;
	}
	
	public static String getRandomDate() {
		return randomDate;
	}
	
	private static String nameFieldRequiredText = "//*[starts-with(@id, 'ddmForm')]/div/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div";
	private static String dateFieldRequiredText = "//*[starts-with(@id, 'ddmForm')]/div/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div";
	private static String commentFieldRequiredText = "//*[starts-with(@id, 'ddmForm')]/div/div/div[1]/div/div/div[2]/div/div/div/div";
	private static String partyRockText = "//*[contains(@class, 'lfr-ddm-form-page-description')]";
	private static String succesfulMessage = "//*[contains(@class, 'ddm-form-description')]";
	private static String submitButton = "//*[contains(@class, 'btn-primary lfr-ddm-form-submit')]";
	private static String nameField = "//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhatIsYourName')]";
	private static String dateField = "//*[contains(@class, 'form-control input-group-inset input-group-inset-after')]";
	private static String commentField = "//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhyDidYouJoin')]";
	private static String randomDate = "//*[contains(@arialabel, '2020 8 9')]";
}
