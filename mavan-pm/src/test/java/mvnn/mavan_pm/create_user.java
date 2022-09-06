package mvnn.mavan_pm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class create_user {
	@Test
public static WebDriver url() throws IOException {
	System.setProperty("webdriver.chrome.driver","./xl/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.get("https://www.etsy.com");
	driver.manage().window().maximize();
	return driver;
}
	@Test
	public void signup() throws IOException, InterruptedException
	{
		
		WebDriver driver=create_user.url();
		pages signUp=new pages(driver);
		signUp.sign_in.click();
		signUp.reg_button.click();
		Thread.sleep(1000);
		signUp.email.sendKeys("jagadeeshu123gbd@gmail.com");
		signUp.First_name.sendKeys("jagadeesh");
		signUp.password.sendKeys("Jaga@9686");
		signUp.reg_button.click();
		
		System.out.println("done*************************************************************8");
		
		
		
		
	}
}
