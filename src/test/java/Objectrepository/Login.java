package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	private By log =By.xpath("//a[@class='ico-login']");
	
	public WebElement logm()
	{
		return driver.findElement(log);
	
	}
	
	
	
//	private By user=By.cssSelector("input[id='Email']");
	
	
	private @FindBy(css="input[id='Email']")
	WebElement username;
	
	public WebElement Username()
	{
		return username;
	}
	
	private By password=By.cssSelector("input[id='Password']");
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	//private @FindBy(css="input[id='RememberMe']")
	
	private By check=By.cssSelector("[id='RememberMe']");
//	WebElement check;
	
	public WebElement checkbox()
	{
		return driver.findElement(check);
	}
	
	private By logbutt=By.cssSelector("input[value='Log in']");
	
	public WebElement loginbutton()
	{
		return driver.findElement(logbutt);
	}
	}
