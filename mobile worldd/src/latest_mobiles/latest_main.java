package latest_mobiles;

import static org.testng.Assert.assertTrue;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import mw.login_obj;

public class latest_main {
	@Test
	public void me() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/");
		latest_obj n=new latest_obj(driver);
		n.latest_mobiles.click();
		n.samsung.click();
		n.more_details.click();
		n.order.click();
		Set<String> w =driver.getWindowHandles();
		Iterator<String> it=w.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(parent);
		driver.switchTo().window(child);
		
		Thread.sleep(2000);
		n.fn.sendKeys("jagadeesh");
		n.ln.sendKeys("V");
		n.mail.sendKeys("jagadeesha495@gmail.com");  
		n.pwd.sendKeys("Jaga@9686");
		n.gender_radio.click();
		n.mob.sendKeys("8494869704");
		n.adr_1.sendKeys("road");
		n.adr_2.sendKeys("manyatha");
		n.city.sendKeys("bangalore");
		WebElement we=n.state();
		Select dd =new Select(we);
		dd.selectByIndex(2);
		n.zip.click();
		n.brand.click();  
		n.model.click();
		n.count.sendKeys("1");
		WebElement w_e=n.baught();
		Select d_d=new Select(w_e);
		d_d.selectByVisibleText("No");
		n.check1.click();
		n.check2.click();
		n.order_now.click();
		n.alert.click();	
				
		
		
		
		
		
		
}}