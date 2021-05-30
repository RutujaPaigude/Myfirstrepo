package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtility.Base;
import Objectrepository.Login;
import Objectrepository.Logout;

public class MainLogin extends Base {
	
//	public static WebDriver driver;
	
//	public static String URL="http://demowebshop.tricentis.com/";

	@Test
	
	public void login() throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		initialize();

		//driver.get("URl");
		
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Login l =new Login(driver);
		
	l.logm().click();
	l.Username().sendKeys("rutuja3@gmail.com");
	l.password().sendKeys("0123456789");
	l.checkbox().click();
	l.loginbutton().click();
	
	Logout l1= new Logout(driver);
	l1.comp().click();
	
		//driver.close();
	}
	
	
	

}
