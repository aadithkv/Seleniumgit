package gurupom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://demo.guru99.com/V4/");
		driver.get("http://demo.guru99.com/V4/manager/addcustomerpage.php");
		/*login l=new login(driver);
		l.setUserid("mngr261242");
		l.setPasswd("EmubEda");
		l.clickLogin(); 
		
		Home home=new Home(driver);
		home.ClickOnNewCustomer(); */
		
		NewCustomer cust= new NewCustomer(driver);
		cust.setCustomer("Aadith k vijay");
		cust.setRadiobtn("f");
		
	}
	

}
