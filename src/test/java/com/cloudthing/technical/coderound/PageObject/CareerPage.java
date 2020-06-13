package com.cloudthing.technical.coderound.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CareerPage {
	
	
	@FindBy(xpath = "//h3[text() ='Role']/following-sibling::div/div[text()='Dev']")
	WebElement devRoleButton;
	
	@FindBy(xpath = "//h3[text() ='Role']/following-sibling::div/div[text()='DevOps']")
	WebElement devopsRoleButton;
	
	@FindBy(xpath ="//a[@href = '/careers/ux-designer']")
	WebElement uxDesignerOpeningLink;
	
	WebDriver ldriver;
	private static CareerPage obj;
	
	public static CareerPage getInstance(WebDriver rdriver)
	{
		if(obj == null)
			obj= new CareerPage(rdriver);
		return obj;
	}
	private CareerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	private void waitForVisibility(WebElement element) throws Error{
        WebDriverWait wait = new WebDriverWait(ldriver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	public void clickDevRoleButton()
	{
		waitForVisibility(devRoleButton);
		devRoleButton.click();
	}
	
	public void clickDevopsRoleButton()
	{
		waitForVisibility(devopsRoleButton);
		devopsRoleButton.click();
	}
	
	public void clickUxDesignerOpeningLink()
	{
		waitForVisibility(uxDesignerOpeningLink);
		uxDesignerOpeningLink.click();
	}

}
