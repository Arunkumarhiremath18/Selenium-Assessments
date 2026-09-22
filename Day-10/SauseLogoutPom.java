package capgeminiAssignmentsOnSelenium.Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseLogoutPom {
	WebDriver driver;
	public SauseLogoutPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//HamBurger
			@FindBy(xpath = "//div/child::button[@id=\"react-burger-menu-btn\"]")
			private WebElement ham;
			public void getHam() {
				ham.click();
			}
	//logout
		@FindBy(xpath = "//a[text()='Logout']")
		private WebElement logout;
		public void getLogout() {
			logout.click();;
		}

}
