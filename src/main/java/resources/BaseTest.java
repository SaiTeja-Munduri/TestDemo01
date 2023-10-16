package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest 
{
	
	public WebDriver driver;
	public WebDriver initialize() throws IOException
	{
		System.out.println("POst test");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\myntra_homefurnishings\\resources\\data.properties");
		prop.load(fis);
		String browser_name= prop.getProperty("browser");
		String url = prop.getProperty("url");
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			 driver = new ChromeDriver(options);
			
		}
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions firefox_options = new FirefoxOptions();
			firefox_options.addArguments("--disable-notifications");
			 driver = new FirefoxDriver(firefox_options);
			
		}
		else if (browser_name.equalsIgnoreCase("edge")) 
		{
			EdgeOptions edge_options = new EdgeOptions();
			edge_options.addArguments("--disable-notifications");
			driver = new EdgeDriver(edge_options);
		}
		else
		{
			System.out.println("Inavalid Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get(url);
		return driver;
		
	}
}
