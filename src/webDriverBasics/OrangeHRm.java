package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRm {


	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/leave/viewMyLeaveList");

	}

}
