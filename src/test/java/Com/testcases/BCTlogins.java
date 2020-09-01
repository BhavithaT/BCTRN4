package Com.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.TestBase.Testbase;
import Com.pageobjects.Login;
import Com.pageobjects.Mohreviewer;
import Com.pageobjects.mohHOD;
import Com.pageobjects.mohemployee;
import Com.pageobjects.usercitizen;
import Com.pageobjects.userforeign;

public class BCTlogins extends Testbase
{
    Login ln;
    usercitizen user;
    userforeign fore;
    Mohreviewer moh;
    mohemployee emp;
    mohHOD hod;
	
	public BCTlogins() {
		super();
	}
	
	
    @BeforeTest
    public void SetUp()
    {
    	implement();
    	ln=new Login();
    	user=new usercitizen();
    	fore=new userforeign();
    	moh=new Mohreviewer();
    	emp=new mohemployee();
    	hod=new mohHOD();
    }
	
    
	@Test(priority=1)
	public void signpage() throws Exception 
	{
		ln.log();
	}
	
	@Test(priority=2)
	public void sign() throws InterruptedException
	{
		user.userlog();
	}
	
	@Test(priority=3)
	public void foreign() throws InterruptedException
	{
		fore.loguser();
	}
	
	@Test(priority=4)
	public void moh() throws InterruptedException
	{
		moh.usermoh();
	}
	
	@Test(priority=5)
	public void mohempl() throws InterruptedException
	{
		emp.mohemp();
	}
	
	@Test(priority=6)
	public void mohhod() throws InterruptedException
	{
		hod.mohhod();
	}
	
	
	 
	 
   
    
}
