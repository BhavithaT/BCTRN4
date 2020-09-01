package Com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.TestBase.Testbase;

public class Login extends Testbase
{
	@FindBy(xpath="(//a[@href='/login'])[3]")
	WebElement sign1;
	
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-root MuiNativeSelect-select')]")
	WebElement clickonselect;
    
    @FindBy(id="txtMobileNumber")
	WebElement EnterMobileNumber;
    
    @FindBy(xpath="//button[text()='Sign In']")
    WebElement signIn;
    
    @FindBy(xpath="//li[@class='sign-in']//a[1]")
    WebElement logout;
    
    public Login()
    {
    	PageFactory.initElements(driver, this); // this means, current class object
    }
    
    public Login(WebDriver driver) 
    {
		
	}
    
    public void log() throws InterruptedException
    {
    	sign1.click();
    	Thread.sleep(2000);
    	Select sel=new Select(clickonselect);
    	sel.selectByIndex(1);
    	Thread.sleep(3000);
    	EnterMobileNumber.sendKeys("90123456");
    	signIn.click();
    	Thread.sleep(2000);
    	logout.click();
    }
}
