package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gokul A S\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.findElement(By.id("email")).sendKeys("a@b");
		driver.findElement(By.id("pass")).sendKeys("123");
		WebElement wb=driver.findElement(By.name("login"));
		js.executeScript("argument[]0.click()", wb);
		
		
		
	}

}
