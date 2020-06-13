package com.cloudthing.technical.coderound.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class HomePage {
	

	@FindBy(xpath = "//img[@alt ='Menu open icon']")
	WebElement menuButton;
	
	@FindBy(xpath = "//a[@href='/careers']")
	WebElement careerSectionLink;
	
	@FindBy(xpath="//h1[text()='we design, create and automate new digital experiences']")
	WebElement designSection;
	
	WebDriver ldriver;
	
	private static HomePage obj;
	
	public static HomePage getInstance(WebDriver rdriver)
	{
		if(obj == null)
			obj= new HomePage(rdriver);
		return obj;
	}
	private HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	private void waitForVisibility(WebElement element) throws Error{
        WebDriverWait wait = new WebDriverWait(ldriver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	public void clickMenuButton()
	{
		waitForVisibility(menuButton);
		menuButton.click();
	}
	
	public void clickCareerSectionLink()
	{
		waitForVisibility(careerSectionLink);
		careerSectionLink.click();
	}
	
	public void scrollToSection()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView();",designSection );	
	}
	

}
