package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin13 extends BaseClass11 {
	public Adactin13() {
		PageFactory.initElements(driver, this);
			}
@FindBy(id="radiobutton_0")
private WebElement radiobtn;

@FindBy(id="continue")
private WebElement conclick;

public WebElement getRadiobtn() {
	return radiobtn;
}

public WebElement getConclk() {
	return conclick;	
	
	
}}
