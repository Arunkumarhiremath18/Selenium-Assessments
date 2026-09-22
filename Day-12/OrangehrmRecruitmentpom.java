package capgeminiAssignmentsOnSelenium.Day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmRecruitmentpom {
	WebDriver driver;
	public OrangehrmRecruitmentpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//vacancies
	@FindBy(xpath="//a[text()='Vacancies']")
	private WebElement vac;
	public void getVac() {
		vac.click();
	}
	//vacancie addbutton
	@FindBy(xpath="(//button[@type=\"button\"])[6]")
	private WebElement add;
	public void getAdd() {
		add.click();
	}

}
