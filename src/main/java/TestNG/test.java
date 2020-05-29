package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	ChromeDriver driver;
  @BeforeMethod
  public void launch() {
	    WebDriverManager.chromedriver().setup();
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
  public void end() {
	  driver.quit();
  }
  
public static void main(String[] args) {
	System.out.println("Main Function");
	test abc = new test();
	abc.launch();
	abc.verify();
	abc.end();
}
  
}
