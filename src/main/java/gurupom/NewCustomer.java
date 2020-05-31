package gurupom;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
	@FindBy(name="name")
	private WebElement Cname;
	
	@FindBys(@FindBy(name="rad1"))
	private  List<WebElement> Rbtn;
	public NewCustomer(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setCustomer(String name) {
		this.Cname.sendKeys(name);
		
	}
	public void setRadiobtn(String gender) {
		for(WebElement gen:Rbtn) {
			if(gender.equals(gen.getAttribute("value"))) {
				gen.click();
			
		}
				
			}
			
	
	}
}
