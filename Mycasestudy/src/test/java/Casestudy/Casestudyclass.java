package Casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Casestudyclass {
	WebDriver driver;
	@Given("Guest user launching the application")
	public void guest_user_launching_the_application() {
		driver=Stat12.gdriver("Ch");		
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Guest user accessing the SignUp link")
	public void guest_user_accessing_the_SignUp_link() {
		driver.findElement(By.linkText("SignUp")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user makes valid data as the input")
	public void user_makes_valid_data_as_the_input() {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Sweety241996");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("mahitha");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sweety");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd123");
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("abcd123");
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("mahitha@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9865066477");
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("01/29/1998");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Hyderabad");
	    WebElement dn = driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		Select sel = new Select(dn);
		sel.selectByValue("411013");
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("mahi");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("he submits registration success")
	public void he_submits_registration_success() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Registered user clicks on SignIn Link")
	public void registered_user_clicks_on_SignIn_Link() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Registered user provides valid cred")
	public void registered_user_provides_valid_cred() {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("checks for the login status for success")
	public void checks_for_the_login_status_for_success() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("guest user entering some data")
	public void guest_user_entering_some_data() {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("head");
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on find details for the item")
	public void clicks_on_find_details_for_the_item() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Checks for the paynow option")
	public void checks_for_the_paynow_option() {
		WebElement check = driver.findElement(By.xpath("//a[text()=' Add to cart']"));
		System.out.println(check);
			String E_title="PayNow";
			String A_title=check.getText();
		if(A_title.equals(E_title))
	{
				System.out.println("Payment will be done");
			}
			else
			{
				System.out.println("Payment will not be done");
			}
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("Verifies for its addition in the cart")
	public void verifies_for_its_addition_in_the_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}
}
