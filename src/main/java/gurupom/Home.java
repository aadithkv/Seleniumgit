package gurupom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(linkText="New Customer")
	private WebElement newCustomerlink;
	
	@FindBy(linkText="Edit Customer")
	private WebElement editCustomer;
	
	@FindBy(linkText="New Account")
	private WebElement newAccount;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	public void ClickOnNewCustomer() {
		this.newCustomerlink.click();
	}
	public void ClickOnEditCustomer() {
		this.editCustomer.click();
	}
	public void ClickOnNewAccount() {
		this.newAccount.click();
	}
}
