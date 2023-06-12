package pomamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMsignin {
	//WebDriver driver;
	public POMsignin(WebDriver driver2) {
	 PageFactory.initElements(driver2, this);
		
	}
	
	  @FindBy(id="nav-link-accountList") WebElement hellosignin;
	  @FindBy(id="ap_email") WebElement emailid;
	  @FindBy(id="continue") WebElement continuebtn;
	  @FindBy(id="ap_password") WebElement password;
	  @FindBy(id="signInSubmit") WebElement signinbtn;
	  @FindBy(id="nav-link-accountList-nav-line-1") WebElement hellotitle;
	  @FindBy(xpath="//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span") WebElement emailerrormsg;
	  @FindBy(xpath="//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span") WebElement pwderrormsg;
	 	
	public void clickhellosignin() {
		hellosignin.click();
		
		}

	public void typeemailid(String email) {
		emailid.sendKeys(email);
	   }
	public void clickcontinuebtn() {
		continuebtn.click();
	   }
	public void typepassword(String pwd) {
		password.sendKeys(pwd);
	   }
	public void clicksigninbtn() {
		signinbtn.click();
	   }
	public String gethellotitle() {
		String title= hellotitle.getText();
		return (title);
	   }
	public String emailerrormsg() {
		String emailmsg = emailerrormsg.getText();
		return (emailmsg);
	   }
	public String getpwderrormsg() {
		String errorpwd = pwderrormsg.getText();
		return (errorpwd);
	   }
	
}	
	
