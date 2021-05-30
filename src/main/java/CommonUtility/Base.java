package CommonUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static WebDriver driver;
	
	//public static String URL="http://demowebshop.tricentis.com/";


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Base b =new Base();
		b.initialize();
		
		
	}
	


public void initialize() throws IOException {
	Properties prop =new Properties();
	
	FileInputStream fis =new FileInputStream("/C:\\Users\\Hp\\eclipse-workspace\\E2E\\src\\main\\java\\CommonUtility\\data.properties");
	prop.load(fis);
	
	System.out.println(prop.getProperty("browser"));
	
	String url=prop.getProperty("URL");
	
	String brow=prop.getProperty("browser");
	
	if(brow.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get(url);
	}
	else
	{
		System.out.println("internet explorer");
	}

}
}
