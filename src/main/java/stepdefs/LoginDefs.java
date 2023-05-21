package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefs {

	WebDriver driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
		driver.get("https://www.simplilearn.com/");
		Thread.sleep(3000);
	}

	@Given("I have clicked on Login link")
	public void i_have_clicked_on_Login_link() throws InterruptedException {
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		Thread.sleep(3000);
	}

	@When("I enter username")
	public void i_enter_username() {
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys("anoopa.mg@gmail.com");
	}

	@When("I enter password")
	public void i_enter_password() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abcd1234s");
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() throws InterruptedException {
		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();
		Thread.sleep(3000);
	}

	@Then("I should land on login page")
	public void i_should_land_on_home_page() {
		String loginTitle = driver.getTitle();
		if (loginTitle.contains("Learning on Simplilearn")) {
			System.out.println("Successfully navigated to login page ");
		} else {
			System.out.println("Login page launch failed ");
		}
	}

	@Then("I should get the error message")
	public void i_should_get_the_error_message() {
		WebElement error = driver.findElement(By.className("error_msg"));
		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		Assert.assertEquals(ActError, ExpError);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String userNameVal) {
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys(userNameVal);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String pswdVal) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pswdVal);
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String errMsgVal) {
		WebElement error = driver.findElement(By.className("error_msg"));
		String ActError = error.getText();
		String ExpError = errMsgVal;
		Assert.assertEquals(ActError, ExpError);
	}

}
