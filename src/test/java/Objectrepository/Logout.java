package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	public WebDriver driver;
	
	
public Logout(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
//	driver.findElement(By.linkText(null))
}
	
@FindBy(xpath="//ul[@class='top-menu']/li[2]")
WebElement comp;
	
public WebElement comp()
{
	return comp;
}
}
