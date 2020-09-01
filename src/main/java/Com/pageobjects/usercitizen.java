package Com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.TestBase.Testbase;

public class usercitizen extends Testbase
{
	@FindBy(xpath="(//a[@href='/login'])[3]")
	WebElement sign1;
	
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-root MuiNativeSelect-select')]")
	WebElement clickonselect;
    
    @FindBy(id="txtMobileNumber")
	WebElement EnterMobileNumber;
    
    @FindBy(xpath="//button[text()='Sign In']")
    WebElement signIn;
    
    @FindBy(xpath="(//a[@href='/login'])[2]")
    WebElement logout;
    
    public usercitizen()
    {
    	PageFactory.initElements(driver, this); // this means, current class object
    }
    
    public usercitizen(WebDriver driver)
    {
 	   
    }
    
    public void userlog() throws InterruptedException
    {
    	sign1.click();
    	Thread.sleep(2000);
    	Select sel=new Select(clickonselect);
    	sel.selectByIndex(5);
    	Thread.sleep(3000);
    	EnterMobileNumber.sendKeys("99999999 ");
    	signIn.click();
    	logout.click();
    	
    }
}
