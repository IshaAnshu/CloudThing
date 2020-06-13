package com.cloudthing.technical.coderound.PageObject;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CareerForm {
	
	
	@FindBy(id = "yourname")
	WebElement nameTextBox;
	
	@FindBy(id = "youremail")
	WebElement emailTextBox;
	
	@FindBy(id = "anythingyouwouldliketotellus")
	WebElement descriptionTextBox;
	
	@FindBy(id = "resume")
	WebElement fileUploadButton;
	
	@FindBy(xpath ="//button[text() ='Submit']")
	WebElement submitButton;
	
	
	
	WebDriver ldriver;
	private static CareerForm obj;
	
	public static CareerForm getInstance(WebDriver rdriver)
	{
		if(obj == null)
			obj= new CareerForm(rdriver);
		return obj;
	}
	private CareerForm(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	private void waitForVisibility(WebElement element) throws Error{
        WebDriverWait wait = new WebDriverWait(ldriver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	public void setNameTextBox(String name)
	{
		waitForVisibility(nameTextBox);
		nameTextBox.sendKeys(name);
	}
	
	public void setEmailTextBox(String email)
	{
		emailTextBox.sendKeys(email);
	}
	
	public void setDescription(String description)
	{
		descriptionTextBox.sendKeys(description);
	}
	
	public void clickFileUploadButton(String filepath)
	{
		fileUploadButton.sendKeys(filepath);
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}

	

}
