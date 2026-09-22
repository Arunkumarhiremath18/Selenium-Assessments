package capgeminiAssignmentsOnSelenium.Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauseCartPom {
	WebDriver driver;
	public sauseCartPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//cartContains
		@FindBy(xpath = "//span[text()='1']")
		private WebElement cartContains;
		public String getCartContains() {
			return cartContains.getText();
		}
		//open cart
		@FindBy(xpath = "//a[@data-test=\"shopping-cart-link\"]")
		private WebElement cartClick;
		public void getCartClick() {
			 cartClick.click();;
		}
		//product contain
		@FindBy(xpath = "//div[@class=\"cart_item\"]/descendant::div[normalize-space()='Sauce Labs Backpack']")
		private WebElement ProductContain;
		public WebElement getProductContain() {
			return ProductContain;
		}
}
