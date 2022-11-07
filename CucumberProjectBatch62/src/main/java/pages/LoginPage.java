package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	WebDriver driver;
	
	public void openLoginPage() {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=IZH01m5m5z0&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiSVpIMDFtNW01ejAiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1NTA2NDg0MywiaWF0IjoxNjU1MDYzNjQzLCJqdGkiOiI5MjkzYWUwOC04ZmU0LTQxMWYtODNiZC1jYzJlNzUxMWM2ZDEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.lEozhUNhZl8qdoR_u7fvJvddqs0_8e0t1VS6BD3WrulKZpCtXb9ZRDZnTFJO8pSrorY_msXDUIASQeM7gqonXmrij7aPzRS5Jf2_6F7RzqzugXJkemZ9k1mgw7vvPJ3bvfDZhCCNsB-fOmgdPYP1aPqmdWLozJWq6udW5BxRpzm0qG3R9ISsb79W7M8MNKviXwEHzihUh7JSBihc4XfT7KnQ7upwvA2LWWI8oVbQScdPyQULpdZSmHIv_KSUCSTiP_vJTdHPpfIGiMMR0tGkHUy0y0AMadmbxM7AVqYtAjcCu3UnuONzVt1RkGClEOzyUrkODIvdg_RiZYS_uN0r4A&preferred_environment=");
		
	}
	public String getTitle() {
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	public void enterEmailAndPassword(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.id("password-input")).sendKeys(b);
	}
	public void clickOnLoginButton() {
		driver.findElement(By.id("signIn")).click();
	}
	public String readErr() {
		
		String actualError = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualError);
		return actualError;
		
	}
	public void closeBrowser() {
		driver.quit();
	}

}
