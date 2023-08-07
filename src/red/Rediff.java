 package red;

import objectrepository.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Rediff {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\Gokul A S\\Documents\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
		ReddiffLoginPF r=new ReddiffLoginPF(driver);
		r.emailID().sendKeys("qwerty");
		r.password().sendKeys("12345");
		r.signin().click();
		r.forgetPassword().click();
		Forgotpassword f=new Forgotpassword(driver);
		f.email().sendKeys("a@b");
		f.nextButton();
		
	}

}
