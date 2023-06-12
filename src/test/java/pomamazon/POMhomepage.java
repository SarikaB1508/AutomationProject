package pomamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMhomepage {
	WebDriver driver;
	public POMhomepage(WebDriver driver1) {
		 PageFactory.initElements(driver1, this);
		 this.driver=driver1;
		
	}
	@FindBy(id="nav-link-accountList") WebElement hellosignin;
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-newCust\"]/a") WebElement starthere;
	@FindBy(id="twotabsearchtextbox") WebElement searchbar;
	@FindBy(id="nav-search-submit-button") WebElement searchicon;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/span/div/div/span") WebElement result;
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]") WebElement sortby;
	@FindBy(id="a-autoid-8-announce") WebElement pricehightolow;
	@FindBy(xpath="//*[@id=\"p_72/11192170011\"]/span/a/section/i") WebElement custrev;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span") WebElement cards;
	@FindBy(id="add-to-cart-button") WebElement addtocart;
	@FindBy(xpath="//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span") WebElement itemaddedtext;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[12]/div/div/div/div/div[2]/div[1]/h2/a/span") WebElement pokemoncard;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div[2]/div[1]/h2/a/span") WebElement amazoncard;
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input") WebElement proceedtocheckout;
	@FindBy(xpath="//*[@id=\"subtotals-marketplace-table\"]/tbody/tr[1]/td[1]/span") WebElement items;
	@FindBy(id="sc-subtotal-label-buybox") WebElement subtotal;
	@FindBy(xpath="//*[@id=\"sc-active-C719f246e-4187-4665-b5d9-958c9ff9d57b\"]/div[4]/div/div[2]/div[1]/span[2]/span/input") WebElement deleteitem;
	@FindBy(id="sc-subtotal-label-buybox")	WebElement ordersummary;
	@FindBy(id="a-autoid-41-announce")	WebElement gotocart;																			
																		
																						
	  public void hoveroverhellosignin() { 
		  Actions act= new Actions(driver);
		  act.moveToElement(hellosignin).build().perform();
	  }
	   //hellosignin.click(); }
	 
	
	public void clickhellosignin() {
		Actions act= new Actions(driver);
		act.moveToElement(hellosignin).build().perform();	
		hellosignin.click();
	}
	
	public void clickstarthere() {
		starthere.click();
	}
	
	public void search() {
		searchbar.click();
	}
	
	public void search(String jacket) {
		searchbar.sendKeys(jacket);
	}
	
	public void clicksearchicon() {
		searchicon.click();
	}
	
	public String displayresult() {
		String text = result.getText();
		return(text);
	}
		
	public void clicksortby() {
		sortby.click();
	}
	
	public void clickhightolow() {
		pricehightolow.click();
	}
	
	public void clickcustrev() {
		custrev.click();
	}
	
	public void clickcards() {
		cards.click();
	}
	
		
	public void clickaddtocartbtn() {
		addtocart.click();
	}
	
	public String itemaddedtocart() {
		String item = itemaddedtext.getText();
		return(item);
	}
	
	public void clickpokemoncard() {
		pokemoncard.click();
	}
	
	public void typeamazoncard(String amazon) {
		searchbar.sendKeys(amazon);
		
	}
	public void clickamazoncard() {
		amazoncard.click();
	}
	
	public void clickproceedtocheckout( ) {
		proceedtocheckout.click();
	}
	
	public String getitems() {
		String number = items.getText();
		return(number);
	}
	
	public String getsubtotal() {
		String getsubtotalnumber = subtotal.getText();
		return(getsubtotalnumber);
	}
	
	public void clickgotocartbtn() {
		gotocart.click();
	}
	
	public void clickdelete() {
		deleteitem.click();
	}
	
	public String getordersummary() {
	String ordsum = ordersummary.getText();
	return(ordsum);
	}
}

