package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage {

	static WebDriver driver;
	static WebDriverWait wait;
	
	@Given("user is on login page")
	public void TestCase1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PragatiS\\Desktop\\JArFile\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}
	
	@When("user enter username {string}")
	public void TestCase2(String UserID)
	{
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='uid']")));
		WebElement UserIdElem = driver.findElement(By.xpath("//input[@name='uid']"));
		UserIdElem.sendKeys(UserID);
	}
	
	@And("user enters password {string}")
	public void TestCase3(String Password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		WebElement PasswordElem = driver.findElement(By.xpath("//input[@name='password']"));
		PasswordElem.sendKeys(Password);
	}
	
	@And("user clicks on login button")
	public void TestCase4()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnLogin")));
		WebElement LoginBtnElem = driver.findElement(By.name("btnLogin"));
		LoginBtnElem.click();
	}
}
