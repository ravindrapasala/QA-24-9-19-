package webDriverBasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT_Ex {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zamzar.com/");
		driver.findElement(By.xpath("//*[@id='uploader-tool-step-1']/div/div/p[1]/button")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Surya\\Desktop\\hello.exe");
		Thread.sleep(2000);
		driver.close();
		
	}

}
