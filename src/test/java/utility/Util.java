package utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Util {
	public WebDriver driver4;
		
	
	@SuppressWarnings("deprecation")
	
	public WebDriver initiatebrowser() {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suraj\\eclipse-workspace-ROICIANS\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver4= new ChromeDriver(op);
		driver4.manage().window().maximize();
		driver4.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver4.get("https://www.amazon.ca/");
	    return driver4;
	}			  
}

