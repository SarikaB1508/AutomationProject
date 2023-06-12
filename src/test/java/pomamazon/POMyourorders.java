package pomamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POMyourorders  {
	WebDriver driver;
	public POMyourorders (WebDriver driver1) {
		 PageFactory.initElements(driver1, this);
		 this.driver=driver1;
	}
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div[1]/div[3]/ul/li[2]/a") WebElement buyagain;
	@FindBy(xpath="//*[@id=\"a-autoid-8\"]/span/input") WebElement pokemonaddtocart;
	@FindBy(xpath="//*[@id=\"sc-active-C6d6e57e9-0432-42ae-bdb3-7e4bbc3f9752\"]/div[4]/div/div[3]/ul/li[1]/span/a/span[1]/span/span[2]")  WebElement itemadded;
	
	public void clickbuyagain() {
		buyagain.click();
	}
	
	public void clickpokemonadd() {
		pokemonaddtocart.click();
	}
	
	public String getitemadded() {
	String item= itemadded.getText();
	return (item);
	}
}
