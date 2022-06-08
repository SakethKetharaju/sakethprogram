package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sugarcrm {

	public static void main(String[] args) throws InterruptedException{ 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://account.sugarcrm.com/");
	/*	//Login
		driver.findElement(By.id("email")).sendKeys("saketketharaju12@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Saketh@1999");
		driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[1]/div/div/form/div[4]/button")).click();
     */
		driver.get("https://account.sugarcrm.com/register");
		driver.findElement(By.id("account_name")).sendKeys("Cognizant");
		driver.findElement(By.id("first_name")).sendKeys("Saketh");
		driver.findElement(By.id("last_name")).sendKeys("Ketharaju");
		driver.findElement(By.id("title")).sendKeys("Internship");
	    WebElement job= driver.findElement(By.id("job_level"));
	    Select select = new Select(job);
	    select.selectByValue("cLevel");
	    select.selectByVisibleText("Manager-level");
	    driver.findElement(By.id("email")).sendKeys("saketketharaju12@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Saketh@1999");
	    driver.findElement(By.id("password_confirmation")).sendKeys("Saketh@1999");
	    driver.findElement(By.id("terms")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/form/div[7]/button")).click();
	    Thread.sleep(2000);
	    driver.close();
	    
	}

}

