package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest {
	static WebDriver driver;           //creating global variable
	
	public static void main(String[] args) {
 
		launchBrowser();
		loginTest1();
		//tearDown();
		
		launchBrowser();
		loginTest2();
		//tearDown();
		
		launchBrowser();
		loginTest3();
		//tearDown();
		
	}
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\narub\\june2020selinium\\crm\\driver\\chromedriver.exe");   //setting the property
		driver = new ChromeDriver();              //creating an object to chrome driver
		driver.get("https://www.techfios.com/billing/?ng=admin/");     //navigating to the website
		driver.manage().window().maximize();                            //maximizing the window
		}
	
	public static void loginTest1() {
										//test case 1
		      //identifying the web element and passing user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");  
		driver.findElement(By.id("password")).sendKeys("abc123");                 //identifying the web element and passing user name 
		driver.findElement(By.name("login")).click();     //identifying the web element and clicking on the sign in button
		}
												
		public static void loginTest2() {	//test case 2
		   //identifying the web element and passing user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com"); 
				  
		driver.findElement(By.id("password")).sendKeys("abc123");                 //identifying the web element and passing user name 
		driver.findElement(By.name("login")).click();     //identifying the web element and clicking on the sign in button
		}
	public static void loginTest3() {     //test case 2
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");  
		driver.findElement(By.id("password")).sendKeys("abc123");                 //identifying the web element and passing user name 
		driver.findElement(By.name("login")).click();     //identifying the web element and clicking on the sign in button
	}
	
		public static void tearDown() {
		driver.close();
	}
	

}
