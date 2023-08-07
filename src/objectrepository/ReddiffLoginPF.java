package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddiffLoginPF {
	
	WebDriver driver;
	
	public ReddiffLoginPF(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=".//*[@id='login1']")
	WebElement username;
	@FindBy(name="passwd")
	WebElement password;
	@FindBy(name="proceed")
	WebElement signin;
	@FindBy(name="Forgot Password?")
	WebElement fp;
	
	public WebElement emailID() {
		return username;
		
	}
	public WebElement password() {
		return password;
		
	}
	public WebElement signin() {
		return signin;
		
	}
	public WebElement forgetPassword() {
		return fp;
		
	}
	
	
	
	

}
