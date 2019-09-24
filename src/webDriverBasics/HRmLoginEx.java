package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRmLoginEx {
public static void main(String[] args) {
	FirefoxDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://testingmasters.com/hrm");
	driver.findElement(By.id("txtUsername")).sendKeys("user02");
	driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
	driver.findElement(By.id("btnLogin")).click();
	driver.quit();
	
	
	
}
	
	
	
	
}
