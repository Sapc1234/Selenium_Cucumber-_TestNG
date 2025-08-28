package ecom_Rsa_Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils

{
	public WebDriver driver;

	public GenericUtils(WebDriver driver)

	{
		this.driver = driver;
	}

	public void switchToChild()

	{
		Set<String> set = driver.getWindowHandles();
		Iterator<String> i = set.iterator();
		String parentWindow = i.next();
		String childWindow = i.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
