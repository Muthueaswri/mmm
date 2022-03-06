package org.com;

import org.openqa.selenium.WebElement;

public class Tc01 extends Adactin11{
	public static void main(String[] args) {
		BaseClass11 b=new BaseClass11();
		b.getDriver();
		b.loadurl("https://www.facebook.com/");
		b.maximise();
		Adactin11 p=new Adactin11();
		
		WebElement txtusername=p.getTxtUsername();
		b.type(txtusername,"naveen3");
	
		WebElement txtPass=p.getTxtPass();
		b.type(txtPass,"C1IZAU");
	
		WebElement txtLogin=p.getTxtLogin();
		b.click(txtLogin);
		
}}
