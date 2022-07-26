package mw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class order_obj {
	WebDriver driver;
public order_obj(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);  
	}
@FindBy(xpath="(//a[@class='nav-link dropdown-toggle'])[2]")
WebElement support;
@FindBy(xpath="//a[text()='Order']")
WebElement order2;

@FindBy(xpath="(//div/input)[1]")   
WebElement fn;
@FindBy(xpath="(//div/input)[2]")    
WebElement ln;
@FindBy(id="inputEmail")
WebElement mail;
@FindBy(id="inputPassword") 
WebElement pwd;
@FindBy(id="flexRadioDefault1")  
WebElement gender_radio;
@FindBy(xpath="//input[@type='number']") 
WebElement mob;
@FindBy(xpath ="//input[@placeholder='12 Apartment or floor']")  
WebElement adr_1;
@FindBy(xpath="//input[@placeholder='Main St']")  
WebElement adr_2;
@FindBy(id="inputCity")  
WebElement city;
@FindBy(xpath ="//select[@class='form-control']")  
WebElement state;
public WebElement state()
{
	return state;
}
@FindBy(id="inputZip")    
WebElement zip;
@FindBy(xpath ="//input[@rel='samsung']")    
WebElement brand;
@FindBy(xpath ="//option[text()='Samsung S21 FE ']")    
WebElement model;
@FindBy(xpath ="//input[@placeholder='no of mobiles']")    
WebElement count;
@FindBy(xpath ="//select[@id='bought']")    
WebElement already_baught;
public WebElement baught()
{
	return already_baught;
}
@FindBy(id="gridCheck1") 
WebElement check1;
@FindBy(xpath="(//input[@id='gridCheck1'])[2]")    
WebElement check2;
@FindBy(xpath ="//button[@class='btn btn-primary']")    
WebElement order_now;
@FindBy(xpath="//a[@class='btn btn-secondary']")
WebElement alert;

}
