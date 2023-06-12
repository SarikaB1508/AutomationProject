package pomamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMyourpayments  {
	WebDriver driver;
	public POMyourpayments (WebDriver driver1) {
		 PageFactory.initElements(driver1, this);
		 this.driver=driver1;
	}
	@FindBy(id="pp-QGtqsd-37") WebElement addpayment;
	@FindBy(xpath="//*[@id=\"pp-DDxp8K-50\"]/span/input") WebElement addcard;
	@FindBy(id="pp-6tsBYi-16") WebElement cardnum;
	@FindBy(id="pp-6tsBYi-18") WebElement nameoncard;
	@FindBy(id="pp-6tsBYi-22") WebElement month;
	@FindBy(id="pp-5bvuXF-21") WebElement selyear;
	@FindBy(xpath="//*[@id=\"pp-6tsBYi-26\"]/span/input") WebElement addyourcard;
	

	public void clickaddpy() {
		addpayment.click();
	}
	public void clickaddcard() {
		addcard.click();
	}
	public void typecardnumber(String num) {
		cardnum.sendKeys(num);
	}
	public void typename(String name) {
		nameoncard.sendKeys(name);
	}
	public void selectmonth() {
		Select sel = new Select(month);
		sel.selectByIndex(3);
	}
	public void selectyear() {
		Select sel = new Select(selyear);
		sel.selectByIndex(3);
	}
	public void clickyoucard() {
		addyourcard.click();
	}
	
	
}



