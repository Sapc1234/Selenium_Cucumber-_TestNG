package eCom_Cucumber_PageObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage

{
	public WebDriver driver;

	public OffersPage(WebDriver driver)

	{
		this.driver = driver;
	}

	private By search = By.xpath("//input[@id='search-field']");
	private By productName = By.cssSelector("tbody tr td:nth-child(1)");

	public void enterSearchItem(String name)

	{
		driver.findElement(search).sendKeys(name);
	}

	public void getSearchText(String name)

	{
		driver.findElement(search).getText();
	}

	public String getProductName()

	{
		return driver.findElement(productName).getText();
	}
}
