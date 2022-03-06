package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin15 extends BaseClass11 {
	public Adactin15() {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(id="order_no")
private WebElement ordid;

public WebElement getOrdid() {
	return ordid;
}
}
