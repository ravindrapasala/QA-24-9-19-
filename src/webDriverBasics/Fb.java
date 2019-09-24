package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("uma.sree53@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("raindrop");
driver.findElement(By.xpath("//input[@value='Log In']")).click();

Actions act_obj = new Actions(driver);
WebElement Messenger = driver.findElement(By.xpath("//a[@title='Messenger']"));
act_obj.moveToElement(Messenger).click();
 driver.quit();
 



	}

}
