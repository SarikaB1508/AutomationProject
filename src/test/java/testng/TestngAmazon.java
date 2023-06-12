package testng;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomamazon.Createacc;
import pomamazon.POMhomepage;
import pomamazon.POMsignin;
import utility.Util;

public class TestngAmazon {
	
	public WebDriver driver1;
	public POMhomepage homepage;
	public Createacc createeacc;
	public Util utility;
	public POMsignin signin;
	 

public TestngAmazon() {
	  
}

@BeforeMethod
public void initsetup() throws InterruptedException {	
	  utility = new Util();
	  driver1 = utility.initiatebrowser();
	  homepage= new POMhomepage(driver1);
	  createeacc= new Createacc(driver1);
	  signin = new POMsignin(driver1);
		Thread.sleep(3000);
	}

@Test
public void createaccount() {
	homepage.hoveroverhellosignin();
	homepage.clickstarthere();
	String text = createeacc.createacctext();
    Assert.assertEquals("You are not on create account page","Create account" , text);
    createeacc.typeyourname("abc def");
    createeacc.typeemailid("abc@yahoo.com");
	createeacc.clickpwdbox();
	createeacc.typepassword("please");
	createeacc.typepasswordagain("please");
	createeacc.clickcontinue();
	System.out.println("Your account is created");
}
@Test
public void signin() {
	
	homepage.clickhellosignin();
	signin.typeemailid("abc@.com");
	signin.clickcontinuebtn();
	signin.typepassword("******");
	signin.clicksigninbtn();
	String title = (String) signin.gethellotitle();
    Assert.assertEquals("The Title is not matching","Hello, abc" , title);
    System.out.println(title);
}

@AfterMethod
public void close() {
	driver1.close();
	
	
}



}




