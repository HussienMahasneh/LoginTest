package firstProjectJuly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyfirstClass {
	
     WebDriver driver =new ChromeDriver();	
	 @BeforeTest
	 public void mySetup() {
		 
		 driver.get("https://www.google.co.uk/");
		 driver.manage().window().maximize();
		 
		 }
	 
	 @Test 
	 public void myFirstTest() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Hussein Mahasneh on linkedin");
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		 Thread.sleep(5000);
		 driver.navigate().back();
	 }
	

}
