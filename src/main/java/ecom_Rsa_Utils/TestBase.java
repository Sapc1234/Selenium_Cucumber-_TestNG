package ecom_Rsa_Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase

{
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException

	{
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");

		// String browser = prop.getProperty("browser");

		String browserName = System.getProperty("browser") != null ? System.getProperty("browser")
				: prop.getProperty("browser").toLowerCase();
		System.out.println(browserName);

		if (driver == null)

		{
			if (browserName.equalsIgnoreCase("chrome"))

			{
				WebDriverManager.chromedriver().setup();
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
				chromeOptions.setAcceptInsecureCerts(true);

				if (prop.getProperty("headless").equalsIgnoreCase("yes"))

				{

					return new ChromeDriver(chromeOptions);

				}

				else

				{
					return new ChromeDriver(chromeOptions);
				}
			}

			else if (browserName.equalsIgnoreCase("firefox"))

			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

			else if (browserName.equalsIgnoreCase("edge"))

			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}
		return driver;
	}
}
