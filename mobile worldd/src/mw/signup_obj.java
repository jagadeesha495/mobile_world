package mw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class signup_obj{
 WebDriver driver;
public signup_obj(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//button[text()='SIGN IN']")
WebElement but;
@FindBy(xpath = "//a[.='Sign up']")
WebElement signup;
@FindBy(id = "myName")
WebElement fn;
@FindBy(xpath = "(//input[@type='text'])[2]")
WebElement ln;
@FindBy(xpath = "//input[@type='Email']")
WebElement mail;
@FindBy(xpath = "//input[@type='Password']")
WebElement mail_pwd;
@FindBy(xpath = "//input[@type='date']")
WebElement date;
@FindBy(xpath = "//input[@type='radio']")
WebElement radio;
@FindBy(xpath = "//input[@type='number']")
WebElement num;
@FindBy(xpath = "//textarea[@placeholder='Short Bio']")
WebElement textarea;
@FindBy(xpath = "//button[@type='submit']")
WebElement register;
}