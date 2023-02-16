package AmazonTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonPageObject { 
	
	@Test
	public static void success1()
	 {
		System.out.println("success1");
	 }
	
	@Test
	public static void success2()
	 {
		System.out.println("success2");
	 }
	
	@Test
	public static void success3()
	{
		System.out.println("success3");
	 }
	 @Test
	 public static void signin()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.in/");  
	        driver.manage().window().maximize();  
	 driver.findElement(By.linkText("Sign in")).click();
     driver.findElement(By.id("ap_email")).sendKeys("9566110824");
     driver.findElement(By.id("continue")).click();;
     driver.findElement(By.id("ap_password")).sendKeys("Durga1997$");
     driver.findElement(By.id("signInSubmit")).click();
     Actions action= new Actions(driver);
     action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")));
     action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[13]/span"))).click().build().perform();
     
	 }
	 
	 @Test
	 public static void search()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.in/");  
	        driver.manage().window().maximize();  
	 driver.findElement(By.linkText("Sign in")).click();
  driver.findElement(By.id("ap_email")).sendKeys("9566110824");
  driver.findElement(By.id("continue")).click();;
  driver.findElement(By.id("ap_password")).sendKeys("Durga1997$");
  driver.findElement(By.id("signInSubmit")).click();
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dresses for women");
  driver.findElement(By.id("nav-search-submit-button")).click();
     
	 }
	 
	 @Test
	 public static void select()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.in/");  
	        driver.manage().window().maximize();  
	 driver.findElement(By.linkText("Sign in")).click();
  driver.findElement(By.id("ap_email")).sendKeys("9566110824");
  driver.findElement(By.id("continue")).click();;
  driver.findElement(By.id("ap_password")).sendKeys("Durga1997$");
  driver.findElement(By.id("signInSubmit")).click();
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dresses for women");
  driver.findElement(By.id("nav-search-submit-button")).click();
     driver.findElement(By.linkText("Women's Mini Dress")).click();
     Set<String> windows= driver.getWindowHandles();
     Iterator<String> i= windows.iterator();
     i.next();
     String child= i.next();
     driver.switchTo().window(child);
     driver.findElement(By.id("add-to-cart-button")).click();
	 }
     
     }
