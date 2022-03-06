package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin14 extends BaseClass11 {
	public Adactin14() {
		PageFactory.initElements(driver, this);
			}
	@FindBy(name="first_name")
	private WebElement fstname;
	
	@FindBy(id="last_name")
	private WebElement lstname;
	
	@FindBy(id="address")
	private WebElement addr;
	
	@FindBy(id="cc_num")
	private WebElement cnum;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvnum;
	
	@FindBy(id="book_now")
	private WebElement clkbk;
	
	public WebElement getFstname1() {
		return fstname;}
	
	public WebElement getlstname() {
		return lstname;}
		
	public WebElement getAdrs() {
		return Adrs();}
	
	public WebElement getCrdnum() {
		return Crdnum();}
	
	public WebElement getCrdtype() {
		return crdtype;}
	public WebElement getExmonth() {
		return exmnth;}
	public WebElement getExpyr() {
		return expyr;}
	
	public WebElement getAddrs() {
		return adrs;}
	
	public WebElement getCrdnum() {
		return crdnum;}
	
	public WebElement getCrdtype() {
		return crdtype;}
	
	public WebElement getExmonth() {
		return exmnth;}
	
	public WebElement getyear() {
		return exyr;}
	
	public WebElement getCvvnum() {
		return cvvnum;}
	
	public WebElement getClkbk() {
		return clkbk;}
	   
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	}
	
	
	

}
