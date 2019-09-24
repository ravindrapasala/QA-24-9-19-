package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailEx {

	public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.id("identifierId")).sendKeys("toratiuma@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	

	
	driver.findElement(By.name("password")).sendKeys("sathvika");
	driver.findElement(By.id("passwordNext")).click();


	}

}
