package Com.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.TestBase.Testbase;

public class Mohreviewer extends Testbase
{
   @FindBy(xpath="//input[@name='phone']")
   WebElement mobile;
   
   @FindBy(xpath="//button[@class='loginButtonblue']")
   WebElement logsin;
   
   @FindBy(xpath="//img[@class='jss6']")
   WebElement logout;
   
   
   public Mohreviewer()
   {
	   PageFactory.initElements(driver, this); // this means, current class object
   }
   
   public Mohreviewer(WebDriver driver)
   {
	   
   }
   

    public void usermoh()
    {
	   mobile.sendKeys("98076901");
	   logsin.click();
	   Alert a = driver.switchTo().alert();
	   String msg=a.getText();
	   System.out.println(msg);
	   a.accept();
	   logout.click();
	   
   }
}
