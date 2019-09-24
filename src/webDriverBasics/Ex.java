package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex {

	public static void main(String[] args) {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://mail.google.com/mail/#inbox");

	}

}
