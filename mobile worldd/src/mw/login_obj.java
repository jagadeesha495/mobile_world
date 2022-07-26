package mw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_obj {
	
		 WebDriver driver;
		public login_obj(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//button[text()='Sign In']")
		WebElement but;
		@FindBy(id = "username")
		WebElement un;
		@FindBy(id = "password")
		WebElement pwd;
		@FindBy(xpath = "//a[.='Log In']")
		WebElement submit;
		}
		
		