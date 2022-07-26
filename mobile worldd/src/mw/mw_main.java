package mw;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class mw_main {

@Test
public static void main() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.manage().window().maximize();
	
 //     sign up module>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	signup_obj n=new signup_obj(driver);
	n.but.click();
	n.signup.click();
	n.fn.sendKeys("jagadeesha");
	n.ln.sendKeys("v");
	n.mail.sendKeys("jagadeesha495@gmail.com");
	n.mail_pwd.sendKeys("Jaga@9686");
	n.date.sendKeys("02031998");
	n.radio.click();
	n.num.sendKeys("8494867404");
	n.textarea.sendKeys("hiii");
	n.register.click();
	driver.switchTo().alert().accept();

////	login  module >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	

	login_obj n1=new login_obj(driver);
	n1.but.click();
	driver.switchTo().alert().accept();
	n1.un.sendKeys("agadeesha495@gmail.com");
	n1.pwd.sendKeys("Jaga@9686");
	n1.submit.click();

////	order module>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	order_obj n3= new order_obj(driver);
	n3.support.click();
	n3.order2.click();
	Set<String> w =driver.getWindowHandles();
	Iterator<String> it=w.iterator();
	String parent = it.next();
	String child = it.next();
	driver.switchTo().window(parent);
	driver.switchTo().window(child);
	n3.fn.sendKeys("jagadeesh");
	n3.ln.sendKeys("V");
	n3.mail.sendKeys("jagadeesha495@gmail.com");  
	n3.pwd.sendKeys("Jaga@9686");
	n3.gender_radio.click();
	n3.mob.sendKeys("8494869704");
	n3.adr_1.sendKeys("road");
	n3.adr_2.sendKeys("manyatha");
	n3.city.sendKeys("bangalore");
	WebElement we=n3.state();
	Select dd =new Select(we);
	dd.selectByIndex(2);
	n3.zip.click();
	n3.brand.click();  
	n3.model.click();
	n3.count.sendKeys("1");
	WebElement w_e=n3.baught();
	Select select=new Select(w_e);
	select.selectByVisibleText("No");
	n3.check1.click();
	n3.check2.click();
	n3.order_now.click();
	n3.alert.click();

// contact us module>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	contactus n4= new contactus(driver);
	n4.support.click();
	n4.cntus.click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it1 = windows.iterator();
	String pppp = it1.next();
	String ch1 = it1.next();
	String ch2 = it1.next();
    driver.switchTo().window(ch2);
	driver.manage().window().maximize();
	n4.uname.sendKeys("jagadeesh");
	n4.Email.sendKeys("jagadeesha495@gamil.com");
	n4.Phone.sendKeys("8494869704");
	n4.Message.sendKeys("jhgghvjbkjgfdcghjkjgfssfgyhgrrcv vxtdv vfrtedg viyutysrhxn  viykutrystzb  viyujtyxezr");
	n4.send.click();
}
}
	
	


