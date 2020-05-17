package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class test {
	ChromeDriver driver;
  @BeforeMethod
  public void launch() {
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://192.168.56.101:3001");
	  }
  
  @Test
  public void verify() {
	    String x = driver.getCurrentUrl();
	    System.out.println(x);
	    driver.findElement(By.name("login")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("admin");
	    driver.findElement(By.name("click")).click();
  }

  @AfterMethod
  public void close() {
	  driver.close();
  }
}
