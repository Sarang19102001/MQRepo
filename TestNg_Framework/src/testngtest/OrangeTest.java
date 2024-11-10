package testngtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeTest {
	WebDriver driver;
	@ BeforeClass
	public void setUp(){
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Browser Initialized");
	}
	
	  @Test(priority=1,enabled=false)
	  public void adminLogin() {
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		System.out.println("Login Successfull");
		Assert.assertEquals("Sarang", "Sarang");
		Reporter.log("Completed");
	}
	  
	  @Test(priority=2)
	  public void adminLogout() {
		  System.out.println("Logout succefukk");
		  Reporter.log("Completed");
	  }
	  
	  @AfterClass
	  public void tearDown() {
		  driver.quit();
		  System.out.println("Browser closed Successfully");
	  }

}
