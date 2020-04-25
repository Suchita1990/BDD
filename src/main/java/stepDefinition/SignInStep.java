package stepDefinition;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.util.List;

import org.junit.AfterClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.cucumber.signin.pages.SignInPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SignInStep {
	public int result=0;
	RemoteWebDriver driver;
	//private SignInPage signin;
	
	@AfterClass
	public void generateReport() {
		File config=new File("E:\\Eclipse Workspace\\com.bdd.cucumber\\Config\\extend-config.xml");
		Reporter.loadXMLConfig(config);
		
	}
//	@Before("@RunOnlyThis")
//	@Before("@SmokeWebTest")
	@Before(order=1)
	public void browser_Setup() {
		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		System.out.println("Setting up the browser");
	//	System.setProperty("webdriver.chrome.driver", "E:\\Java program\\JARs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//signin = PageFactory.initElements(driver, SignInPage.class);
		//ExtendReports report=new ExtendReports("/target/Report");

	}
	@Before(order=2)
	public void setupDatabase() {
		System.out.println("Setting up database");
	}
	@Before(order=1)
	private void setupFileServer() {
		System.out.println("Setting up file server");

	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("^User opens a chrome browser$")
	public void user_opens_a_chrome_browser() throws Throwable {
	    
	}

	@When("^User enters the signin page url$")
	public void user_enters_the_signin_page_url() throws Throwable {
	   
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String arg1, String arg2) throws Throwable {
		SignInPage signin=PageFactory.initElements(driver, SignInPage.class);
		signin.enterEmailOrPhone(arg1);
		signin.enterPassword(arg2);
		signin.clickOnLoginButton();
	  
	}

	/*@Then("^User should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	    SignInPage sigin=PageFactory.initElements(driver, SignInPage.class);
	    Assert.assertTrue(sigin.isErrorAppear());
	}
*/
	/*@When("^User should able to login$")
	public void user_should_able_to_login() throws Throwable {
	    SignInPage sigin=PageFactory.initElements(driver, SignInPage.class); 
	    assertFalse("User is not able to signin",sigin.isErrorAppear());
	}
*/
	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    
	}

}
