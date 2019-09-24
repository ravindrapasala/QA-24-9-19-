package AdvancedXpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
	List<WebElement> ele= driver.findElements(By.xpath("//table/tbody/tr/td[5][text()='Analyst']"));
			
				int a =ele.size();
				
	System.out.println(a);	

	
	for(WebElement ele1:ele)
	{
		System.out.println(ele1.getText());
	}
		
	}

}

// hello hii