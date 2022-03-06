package org.com;

import org.openqa.selenium.WebElement;

public class Tco1 extends BaseClass11 {
	public static void main(String[] args) {
		BaseClass11 bc=new BaseClass11();
		bc.getDriver();
		bc.loadurl("https://adactinhotelapp.com//");
		bc.maximise();
		
		bc.implicityWait(10);
		
		Adactin11 pg = new Adactin11();
		WebElement txtUsername = pg.getTxtUsername();
		String data = bc.getdata("Sheet1", 1, 0);
		bc.type(txtUsername,data );
		
		WebElement txtPassword = pg.getTxtPass();
		String data2 = bc.getdata("Sheet1", 1, 1);
		bc.type(txtPassword, data2);
		
		WebElement txtLogin = pg.getTxtLogin();
		bc.click(txtLogin);
		
		Adactin11 a2 = new Adactin11();
		
		WebElement locat = a2.getLocat();
		bc.selectByIndex(locat,3);
		
		WebElement hotel = a2.getHotel();
		bc.selectByIndex(hotel, 2);
		
		WebElement room = a2.getRoom();
		bc.selectByIndex(room, 1);
		
		WebElement count = a2.getCount();
		bc.selectByIndex(count, 2);
		
		WebElement adult = a2.getAdult();
		bc.selectByIndex(adult, 1);
		
		WebElement child = a2.getChild();
		bc.selectByIndex(child, 1);
		
		WebElement click = a2.getClick();
		bc.click(click);
		
		Adactin11 a3 = new Adactin11();
		
		WebElement radiobtn = a3.getRadiobtn();
		bc.click(radiobtn);
		
		WebElement conclk = a3.getConclk();
		bc.click(conclk);
		
		Adactin11 a4=new Adactin11();

		WebElement fstname = a4.getFstname();		
		String data3 = bc.getdata("Sheet1", 1, 2);
		bc.type(fstname, data3);
		
		WebElement lstname = a4.getLstname();
		String data4 = a4.getData("Sheet1", 1, 3);
		bc.type(lstname, data4);
		
		WebElement adrs = a4.getAdrs();
		String data5 = a4.getData("Sheet1", 1, 4);
		bc.type(adrs, data5);
		
		WebElement crdnum = a4.getCrdnum();
		String data6 = a4.getData("Sheet1", 1, 5);
		bc.type(crdnum, data6);
		
		WebElement crdtyp = a4.getCrdtyp();
		String data7 = a4.getData("Sheet1", 1, 6);
		bc.type(crdtyp, data7);
		
		WebElement exmnth = a4.getExmnth();
		bc.selectByIndex(exmnth, 2);
		
		WebElement expyr = a4.getExpyr();
		bc.selectByIndex(expyr, 12);
		
		WebElement cvvnum = a4.getCvvnum();
		String data8 = a4.getData("Sheet1", 1, 7);
		bc.type(cvvnum, data8);
		
		WebElement clkbk = a4.getClkbk();
		bc.click(clkbk);
		
		Adactin11 a5 =new Adactin11();
		
		WebElement ordid = a5.getOrdid();
		String attributeValue = bc.getAttributeValue(ordid);
		bc.WriteData("Sheet1", 1, 9,attributeValue);
		System.out.println(attributeValue);
		
		
	}

}
