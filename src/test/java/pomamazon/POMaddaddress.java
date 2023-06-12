package pomamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMaddaddress {
	WebDriver driver;
	public POMaddaddress(WebDriver driver1) {
		 PageFactory.initElements(driver1, this);
		 this.driver=driver1;
	}
	@FindBy(id="ya-myab-address-add-link") WebElement addaddress;
	@FindBy(id="address-ui-widgets-enterAddressFullName") WebElement fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber") WebElement phonenumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1") WebElement address1;
	@FindBy(id="address-ui-widgets-enterAddressLine2") WebElement address2;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement cityname;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId") WebElement provincename;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") WebElement postalcode;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input") WebElement addaddressbtn;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[1]/div/div/h4") WebElement errormsg;
	
	public void clickaddaddress() {
		addaddress.click();
	}
	public void typefullname(String name) {
		fullname.sendKeys(name);
	}
	public void typephonenumber(String phone) {
		phonenumber.sendKeys(phone);
	}
	public void typeaddress1(String add1) {
		address1.sendKeys(add1);
	}
	public void typeaddress2(String add2) {
		address1.sendKeys(add2);
	}
	public void typecity(String city) {
		cityname.sendKeys(city);
    }
	public void typeprovince() {
		Select sel = new Select(provincename);
		sel.selectByVisibleText("Ontario");
    }
	public void typepostalcode(String postal) {
		postalcode.sendKeys(postal);
    }
	public void clickaddaddressbtn() {
		addaddressbtn.click();
    }
	public String geterrormsg() {
		String error = errormsg.getText();
		return(error);
	}

}