package mw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactus {
	WebDriver driver;
public contactus(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="(//a[@class='nav-link dropdown-toggle'])[2]")
WebElement support;
@FindBy(xpath="//a[text()='Contact Us']")
WebElement cntus;

@FindBy(xpath ="//input[@placeholder='Username']") 
WebElement uname;
@FindBy(xpath="//input[@placeholder='Email']")   
WebElement Email;
@FindBy(xpath="//input[@placeholder='Phone']")
WebElement Phone;
@FindBy(xpath="//textarea[@placeholder='Message']")
WebElement Message;
@FindBy(xpath="//input[@value='Send']")
WebElement send;
}