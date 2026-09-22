package capgeminiAssignmentsOnSelenium.Day12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangehrmmyinfopom {
	WebDriver driver;
	public orangehrmmyinfopom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
			//firstname
			@FindBy(xpath = "//input[@name=\"firstName\"]")
			private WebElement firstname;
			
			public void getFirstname(String value) {
				firstname.sendKeys(Keys.CONTROL, "a");
				firstname.sendKeys(Keys.BACK_SPACE);
				firstname.sendKeys(value);
			}
			//middlename
			@FindBy(xpath = "//input[@name=\"middleName\"]")
			private WebElement midname;
			
			public void getMidname(String value) {
				midname.sendKeys(Keys.CONTROL, "a");
				midname.sendKeys(Keys.BACK_SPACE);
				midname.sendKeys(value);
			}

			//lastname
			@FindBy(xpath = "//input[@name=\"lastName\"]")
			private WebElement lastname;
			public void getLastname(String value) {
				lastname.sendKeys(Keys.CONTROL, "a");
				lastname.sendKeys(Keys.BACK_SPACE);
				lastname.sendKeys(value);
			}
			//employeeid
			@FindBy(xpath = "//label[text()=\"Employee Id\"]/parent::div/following-sibling::div/child::input")
			private WebElement employeeid;
			public void getEmployeeid(String value) {
				employeeid.sendKeys(Keys.CONTROL, "a");
				employeeid.sendKeys(Keys.BACK_SPACE);
				employeeid.sendKeys(value);
			}
			//savebutton
			@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
			private WebElement savebtn;
			public void getSavebtn() {
				savebtn.click();
			}
			//verfication
			public String getFirstname() {
				return firstname.getDomProperty("value");
			}
			public String getLastname() {
				return lastname.getDomProperty("value");
			}
			
			
			
//			@FindBy(xpath = "//div[@class=\"orangehrm-edit-employee-imagesection\"]/descendant::h6")
//			private WebElement verify;
//			public WebElement getVerify() {
//				return verify;
//			}
			

}
