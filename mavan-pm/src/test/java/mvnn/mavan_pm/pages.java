package mvnn.mavan_pm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages {
		 WebDriver driver;
		public pages(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="(//button[contains(.,'Sign')])[1]")
		public WebElement sign_in;
		@FindBy(xpath="//button[contains(.,'Reg')]")
		public  WebElement reg_button;
		@FindBy(id ="join_neu_email_field")
		public  WebElement email;
		@FindBy(id ="join_neu_first_name_field")
		public  WebElement First_name;
		@FindBy(id ="join_neu_password_field")
		public  WebElement password;
		@FindBy(xpath ="//button[@class='wt-btn wt-btn--primary wt-width-full']")
		public  WebElement Sign_in2;
		@FindBy(xpath ="//h1[@class='wt-text-white welcome-message-text wt-hide-xs wt-show-lg wt-position-relative wt-text-center-xs wt-text-heading-01 wt-p-xs-3 wt-p-md-3']")
		public  WebElement welcome_text;
	
		
}    
//@FindBy(id ="join_neu_email_field")
//WebElement email;
//@FindBy(id ="join_neu_password_field")
//WebElement password;
//@FindBy(id ="(//button[contains(.,'Sign')])[2]")
//WebElement Sign_in2;