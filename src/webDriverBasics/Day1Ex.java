package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1Ex {

	WebDriver driver;
	public void ImvokeBrowser(){
		try {
			//System.setProperty("webdriver.chrome.driver", "‪‪C:\\Users\\Surya\\Desktop\\New folder\\chromedriver.exe");
			//driver = new ChromeDriver();
			driver= new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.edureka.co");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public void SearchCource(){
		driver.findElement(By.id("search-inp1")).sendKeys("java");
		driver.findElement(By.id("search-button-top")).click();
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Day1Ex my_obj1= new Day1Ex();
		my_obj1.ImvokeBrowser();
		
		Day1Ex my_obj2= new Day1Ex();
		my_obj2.SearchCource();
		
	}

}
