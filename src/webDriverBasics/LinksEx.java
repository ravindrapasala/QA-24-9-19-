package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEx {

	public static void main(String[] args) throws InterruptedException {
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 //driver.get("https://www.facebook.com");
	 driver.navigate().to("https://www.facebook.com");
	 
	 driver.findElement(By.linkText("create a page")).click();
	 //driver.findElement(By.partialLinkText("create a")).click();
	 Thread.sleep(2000);
	 
	 driver.navigate().back();
	 
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 
	 Thread.sleep(2000);
	 
	 driver.navigate().forward();

	 
	 
	}

}
