package webDriverBasics;
import java.util.list;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableEx1 {

	public static void main(String[] args) {
FirefoxDriver driver = new FirefoxDriver()	;
driver.manage().window().maximize();
driver.get("http://testingmasters.com/hrm");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

Actions act_obj = new Actions(driver);
WebElement Leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
act_obj.moveToElement(Leave).build().perform();

driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
//driver.findElement(By.xpath("//a[@href=href='/hrm/symfony/web/index.php/leave/viewMyLeaveList/reset/1']")).click();


/*int rowcount = ((Object) driver.findElement(By.xpath("//table[@id='resultTable']/tbodt/tr"))).size();

for(int r=1;r<=rowcount;r++){
	
	int colcount = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td")).size();
	
	for(int c=1;c<=colcount;c++ ){
		
		String cellText=driver.findElement(By.xpath("//table[@id=resultTable]/tbody/tr["+r+"]/td["+c+"]")).getText();
		System.out.println("Cell Text in row -  "+r+" and coloumn - "+c+" is:  "+cellText );
		*/
		
		
	}

	




	}


