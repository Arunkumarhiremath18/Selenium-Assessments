package capgeminiAssignmentsOnSelenium.FinalAssessment.Assignment1.Assignment2;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends OrangeHrmBaseClass1 {
	@Test
	public void TestScript() throws InterruptedException {
		OrangeHrmHomePom h = new OrangeHrmHomePom(driver);
		h.getBuzz();
		OrangeHrmBuzzPom b = new OrangeHrmBuzzPom(driver);
		b.getWhats();
		//post
	
		b.getPost();
		b.getRecent();
		Thread.sleep(5000);
		//verify
		WebElement ele = b.getEletoverify();
		String TextToCompare = ele.getText();
		Assert.assertEquals(TextToCompare, "selenium hello");
		System.out.println("Message Found");
	}

}
