package BaseClassTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Utilities.FileUtil;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass
	public void bc() throws Throwable
	{
		FileUtil flib = new FileUtil();
		String BROWSER = flib.getkeyandvaluepair("browser");
		
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	@AfterClass
	 public void tearDown() {
	        driver.quit();
	    }
	
}
