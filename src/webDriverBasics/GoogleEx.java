package webDriverBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GoogleEx {

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String appTitle = driver.getTitle();
		if(appTitle == ("Google"))
			System.out.println("Google page displayed,pass");
		else System.out.println("Google page not displayed,fail");
		

	}

}
