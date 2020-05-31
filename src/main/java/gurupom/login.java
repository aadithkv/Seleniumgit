/**
 * 
 */
package gurupom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author AADITH
 *
 */
public class login {

	/**
	 * @param args
	 */
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	private WebElement txtusrid;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	private WebElement txtpswd;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	private WebElement lgnbtn;
	
	private WebElement resetbtn;
	public login(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
}
	public void setUserid(String userid) {
		this.txtusrid.sendKeys(userid);
	}
	public void setPasswd(String passwd) {
		this.txtpswd.sendKeys(passwd);
	}
	public void clickLogin() {
		this.lgnbtn.click();
	}
	public void reset() {
		this.resetbtn.click();
	}
}
