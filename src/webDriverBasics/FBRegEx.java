package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBRegEx {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.name("lastname")).sendKeys("Masters");
		driver.findElement(By.name("reg_email__")).sendKeys("uma.sree53@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("raindrop");
		
		
		
	
	}
}
