package pomamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createacc {
	WebDriver driver1;
	
	public Createacc(WebDriver driver1) {
		 PageFactory.initElements(driver1, this);
	}

	@FindBy(css="#ap_register_form > div > div > h1") WebElement createaccpage;
	@FindBy(id="ap_customer_name") WebElement yourname;
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="ap_password_check") WebElement passwordagain;
	@FindBy(id="continue") WebElement continuebtn;
	@FindBy(xpath ="//*[@id=\"auth-customerName-missing-alert\"]/div/div") WebElement errormsg;
	
	public String createacctext() {
		String text = createaccpage.getText();
		return(text);
		}
	
	public void typeyourname(String name) {
		yourname.sendKeys(name);
		}
	
	public void typeemailid(String emailid) {
		email.sendKeys(emailid);
	}
	
	public void clickpwdbox() {
		password.click();
	}
	
	public void typepassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void typepasswordagain(String pwdagain) {
		passwordagain.sendKeys(pwdagain);
	}
	
	public void clickcontinue() {
		continuebtn.click();
	}
	
	public String geterrormsg() {
		String error = errormsg.getText();
		return (error);
	}
	public void navigate() {
		driver1.navigate().to("https://www.amazon.ca/");
	}
}