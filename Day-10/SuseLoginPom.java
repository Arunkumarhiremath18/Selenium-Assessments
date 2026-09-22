package capgeminiAssignmentsOnSelenium.Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuseLoginPom {
	WebDriver driver;
	public SuseLoginPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//username
	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	private WebElement username;
	//password
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	private WebElement password;
	//login button
	@FindBy(xpath = "//input[@id=\"login-button\"]")
	private WebElement loginbtn;
	public void getUsername(String value) {
		username.sendKeys(value);
	}
	public void getPassword(String value) {
		password.sendKeys(value);;
	}
	public void getLoginbtn() {
		loginbtn.click();;
	}
	

}
