/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author suresh
 *
 */
public final class LoginPage
{
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.xpath("");
	By loginbutton=By.name("");
	
	
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
	}

}
