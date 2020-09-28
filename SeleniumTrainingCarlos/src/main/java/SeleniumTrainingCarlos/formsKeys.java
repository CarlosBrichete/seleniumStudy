package SeleniumTrainingCarlos;

import org.openqa.selenium.By;

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
	
	private static String nameFieldRequiredText = "//*[contains(@class, 'form-feedback-item help-block')]";
	private static String dateFieldRequiredText = "//*[contains(@class, 'form-feedback-item help-block')]";
	private static String commentFieldRequiredText = "//*[contains(@class, 'form-feedback-item help-block')]";
	private static String partyRockText = "//*[contains(@class, 'lfr-ddm-form-page-description')]";
	private static String succesfulMessage = "//*[contains(@class, 'ddm-form-description')]";
	private static String submitButton = "//*[contains(@class, 'btn btn-primary lfr-ddm-form-submit pull-right')]";
	private static String nameField = "//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhatIsYourName')]";
	private static String dateField = "//*[contains(@class, 'form-control input-group-inset input-group-inset-after')]";
	private static String commentField = "//*[contains(@class, 'ddm-field-text form-control') and contains(@name, 'WhyDidYouJoin')]";
}
