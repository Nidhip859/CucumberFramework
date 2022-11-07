package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
 

public class LoginStepDefination {
	WebDriver driver;
	LoginPage lp = new LoginPage();
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("Navigate to login page");
	    //open firefox
	    //open scotiabank login page
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=IZH01m5m5z0&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiSVpIMDFtNW01ejAiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1NTA2NDg0MywiaWF0IjoxNjU1MDYzNjQzLCJqdGkiOiI5MjkzYWUwOC04ZmU0LTQxMWYtODNiZC1jYzJlNzUxMWM2ZDEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.lEozhUNhZl8qdoR_u7fvJvddqs0_8e0t1VS6BD3WrulKZpCtXb9ZRDZnTFJO8pSrorY_msXDUIASQeM7gqonXmrij7aPzRS5Jf2_6F7RzqzugXJkemZ9k1mgw7vvPJ3bvfDZhCCNsB-fOmgdPYP1aPqmdWLozJWq6udW5BxRpzm0qG3R9ISsb79W7M8MNKviXwEHzihUh7JSBihc4XfT7KnQ7upwvA2LWWI8oVbQScdPyQULpdZSmHIv_KSUCSTiP_vJTdHPpfIGiMMR0tGkHUy0y0AMadmbxM7AVqYtAjcCu3UnuONzVt1RkGClEOzyUrkODIvdg_RiZYS_uN0r4A&preferred_environment=");
		*/
		lp.openLoginPage();
}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("verify the title");
		String expectedTitle = title;
		String actualTitle = lp.getTitle();
		//System.out.println(actualTitle); 
		lp.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		//verify title
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("enter wrong email and password");
		//enter email and password
		/*driver.findElement(By.id("usernameInput-input")).sendKeys(email);
		driver.findElement(By.id("password-input")).sendKeys(password); */
		lp.enterEmailAndPassword(email, password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //System.out.println("click on login button");
		//click on login button
		//driver.findElement(By.id("signIn")).click();
		lp.clickOnLoginButton();
	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("verify the error message");
		//verify error message
		String expectedError = "Please enter a username or card number without special characters.";
		String actualError = lp.readErr(); //driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualError); 
		lp.readErr();
		Assert.assertEquals(expectedError, actualError);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //System.out.println("close browser");
		//close browser
		//driver.quit();
		lp.closeBrowser();
	}
}
