package eCom_Cucumber_PageObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage

{
	public WebDriver driver;

	public CheckoutPage(WebDriver driver)

	{
		this.driver = driver;
	}

	private By cartBag = By.cssSelector("img[alt='Cart']");
	private By checkoutButton = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	private By promoBtn = By.cssSelector(".promoBtn");
	private By placeOrder = By.xpath("//button[normalize-space()='Place Order']");

	public void checkOutItems()

	{
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}

	public Boolean verifyPromoButton()

	{
		Boolean promo = driver.findElement(promoBtn).isDisplayed();
		return promo;
	}

	public Boolean verifyPlaceOrder()

	{
		Boolean plsOrder = driver.findElement(placeOrder).isDisplayed();
		return plsOrder;
	}

}
