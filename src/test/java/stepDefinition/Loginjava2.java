package stepDefinition;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginjava2 {
public RemoteWebDriver driver;
	
	@Given("Launch the url and positive testcase to login Page")
	
	
	
	
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver. get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//span[@class='title'])[32]"))).build().perform();
		driver.findElement(By.xpath("(//span[@class='title'])[33]")).click();
	}
		
		@Then("Enter the First Name")
		public void enterFirstName() {
			driver.findElement(By.id("input-firstname")).sendKeys("rajee");
		}
		
		@And("Enter the Last Name")
		public void enterLastname() {
			driver.findElement(By.id("input-lastname")).sendKeys("raj");	
			
		}
		
		@Then(" Enter the Email")
		public void enterEmail() {
			driver.findElement(By.id("input-email")).sendKeys("asd3245@gmail.com");
		}
		
		@Then("Enter the telephone Number")
		public void enterTelephoneNumber() {
			driver.findElement(By.id("input-telephone")).sendKeys("234567890");
		}
		
		@And("Enter valid Password")
		public void enterPassword() {
			driver.findElement(By.id("input-password")).sendKeys("987654321");
		}
		@Then(" Enter the Password confirm")
		public void enterPasswordConfirm() {
			driver.findElement(By.id("input-confirm")).sendKeys("987654321");
		}
		@And(" Click the Subscribe")
		public void clickScbscribe() {
			driver.findElement(By.className("custom-control-label")).click();
		}
		@Then(" Click the agri Privacy Policy")
		public void clickThePrivacyPolicy() {
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
		}
		@And("Click the Continue button")
		public void clickContinueButton() {
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			
			
			
			
			
		
	


}
}