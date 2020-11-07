package launchBrowser;
import java.util.concurrent.TimeUnit;

//using JUNIT//does not need main method
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class LoginTestJUnit {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=admin/");         //going to the website
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);    //implicity waits//we can choose the time unit
	}

	@Test
	public void loginTest1() throws InterruptedException {
		// test case 1
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//WebDriverWait wait = new WebDriverWait(driver, 5);      //always is in seconds(explicit wait)
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("login"))));
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);     // stop the driver for certain period of time
		
		
	}

	@Test
	public void loginTest2() throws InterruptedException { // test case 2

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

	@Test
	public void loginTest3() throws InterruptedException { // test case 2
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
	}

	@After
	public void tearDown() {
		driver.close();
	}
}