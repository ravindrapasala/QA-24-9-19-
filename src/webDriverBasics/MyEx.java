package webDriverBasics;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyEx {

	public static WebDriver driver;

	
	public static void launchApp()
	{ 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser type");
		String browser = sc.next();
		
		switch(browser.toUpperCase()){
		
		
		case "FF":
			driver = new FirefoxDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Surya\\Desktop\\New folder\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		driver.get("https://www.google.com/");
	}
	
	public static void main(String[] args) {
		
		launchApp();

	}

}
