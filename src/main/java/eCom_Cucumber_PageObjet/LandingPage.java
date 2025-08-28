package eCom_Cucumber_PageObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage

{
	public WebDriver driver;

	public LandingPage(WebDriver driver)

	{
		this.driver = driver;
	}

	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("h4[class='product-name']");
	private By topDeals = By.cssSelector(".cart-header-navlink[href='#/offers']");
	private By increment = By.cssSelector("a.increment");
	private By clkOnAddToCart = By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])");

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

	public void selectTopdeals()

	{
		driver.findElement(topDeals).click();
	}

	public String getTitleLandingPage()

	{
		return driver.getTitle();
	}

	public void incrementQuantity(int quantity)

	{
		int i = quantity-1;
		while (i > 0)

		{
			driver.findElement(increment).click();
			i--;
		}

	}
	
	public void addToCart()
	
	{
		driver.findElement(clkOnAddToCart).click();
	}
}
