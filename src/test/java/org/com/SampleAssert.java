package org.com;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleAssert {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		}
		@Test
		public void tc1() {
			WebElement txtuser = driver.findElement(By.id("email"));
			
			txtuser.sendKeys("Welcome Java");
			
			Assert.assertEquals(txtuser.getAttribute("value"),"Welcome Java");
			
			WebElement password = driver.findElement(By.id("pass"));
			
			password.sendKeys("javaaaaa");
			
			Assert.assertEquals(password.getAttribute("value"),"javaaa");
			
            WebElement Login1 = driver.findElement(By.xpath("//button['type()=submit']"));
			
			Login1.click();
			
			
			
		}
	}
	


