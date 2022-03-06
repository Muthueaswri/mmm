package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin11 extends BaseClass11 {
	public Adactin11()
	{
	PageFactory.initElements(driver,this);
	
}

@FindBy(xpath="//input[@id='username']")
private WebElement txtUsername;

@FindBy(xpath="//input[@id='pass']")
private WebElement txtPass;

@FindBy(id="login")
private WebElement txtLogin;

public WebElement getTxtUsername() {
	return TxtUsername();
	}
public WebElement getTxtPass() {
	return TxtPass();
	}
public WebElement getTxtLogin() {
	return txtLogin;
	
	}


}