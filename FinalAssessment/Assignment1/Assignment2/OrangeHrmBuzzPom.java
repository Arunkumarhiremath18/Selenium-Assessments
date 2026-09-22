package capgeminiAssignmentsOnSelenium.FinalAssessment.Assignment1.Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmBuzzPom {
	WebDriver driver;
	public OrangeHrmBuzzPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//what is in your mind
		@FindBy(xpath = "//textarea[@placeholder=\"What's on your mind?\"]")
		private WebElement Whats;
		public void getWhats() {
			Whats.sendKeys("selenium hello");
		}
		//post
		@FindBy(xpath = "//button[@type=\"submit\"]")
		private WebElement post;
		public void getPost() {
			post.click();;
		}
		//recent
		@FindBy(xpath = "//button[normalize-space()='Most Recent Posts']")
		private WebElement recent;
		public void getRecent() {
			recent.click();
		}
		//verification
		@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p orangehrm-buzz-post-body-text\"]")
		private WebElement eletoverify;
		public WebElement getEletoverify() {
			return eletoverify;
		}
		

}
