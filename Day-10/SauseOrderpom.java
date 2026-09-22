package capgeminiAssignmentsOnSelenium.Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseOrderpom {
	WebDriver driver;
	public SauseOrderpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//order placed
	@FindBy(xpath = "//div/child::h2[text()='Thank you for your order!']")
	private WebElement orderplaced;
	public WebElement getOrderplaced() {
		return orderplaced;
	}

}
