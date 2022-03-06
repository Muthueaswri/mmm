package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin12 extends BaseClass11 {
	public Adactin12() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="location")
	private WebElement locate;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room ;
	
	@FindBy(id="room_nos")
	private WebElement count;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="submit")
	private WebElement click;
	
	public WebElement getLoacate() {
		return locate;}
		
	public WebElement getHotel() {
			return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getCount() {
		return count;
	
	}
	public WebElement getAdult() {
		return adult;}
	public WebElement getChild() {
		return child;}
	public WebElement getClick() {
		return click;
		
	}}	
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
