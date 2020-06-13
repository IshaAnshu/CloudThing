package com.cloudthing.technical.coderound.TestCases;

import org.testng.annotations.Test;

import com.cloudthing.technical.coderound.PageObject.CareerForm;
import com.cloudthing.technical.coderound.PageObject.CareerPage;
import com.cloudthing.technical.coderound.PageObject.HomePage;

public class CloudThing extends BaseClass {

	@Test
	public void submitResume() {
		HomePage obj=HomePage.getInstance(driver);
		CareerPage career=CareerPage.getInstance(driver);
		CareerForm form=CareerForm.getInstance(driver);
		obj.scrollToSection();
		obj.clickMenuButton();
		obj.clickCareerSectionLink();
		
		career.clickDevopsRoleButton();
		career.clickDevRoleButton();
		career.clickUxDesignerOpeningLink();
		
		//Could have given data via dataprovider, but didn't find time for that
		
		form.setNameTextBox("Isha");
		form.setEmailTextBox("a@gmail.com");
		form.setDescription("I am a graphic designer");
		form.clickFileUploadButton(System.getProperty("user.dir")+"\\src\\test\\testData\\Isha Anshu resume.pdf");
		form.clickSubmitButton();
		
	
	}
}
