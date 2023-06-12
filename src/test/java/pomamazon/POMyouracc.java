package pomamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMyouracc {
	WebDriver driver;
	public POMyouracc(WebDriver driver1) {
		 PageFactory.initElements(driver1, this);
		 this.driver=driver1;
	}
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2") WebElement youraddresses;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2") WebElement yourorders;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2") WebElement yourpayments;
	
	public void clickyouraddress() {
		youraddresses.click();
	}
	public void clickyourorders() {
		yourorders.click();
	}
	public void clickyourpayments() {
		yourpayments.click();
	}
}
