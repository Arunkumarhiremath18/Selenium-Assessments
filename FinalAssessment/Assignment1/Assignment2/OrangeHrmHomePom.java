package capgeminiAssignmentsOnSelenium.FinalAssessment.Assignment1.Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmHomePom {
	WebDriver driver;
	public OrangeHrmHomePom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//buzzlink
	@FindBy(xpath = "//span[normalize-space()='Buzz']")
	private WebElement Buzz;
	public void getBuzz() {
		Buzz.click();
	}
			//clickon profile
			@FindBy(xpath = "(//img[@alt=\"profile picture\"])[1]")
			private WebElement profie;
			public void getProfie() {
				profie.click();
			}
			//logout
			@FindBy(xpath = "//a[normalize-space()='Logout']")
			private WebElement logout;
			public void getLogout() {
				logout.click();
			}

}
