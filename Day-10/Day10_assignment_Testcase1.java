package capgeminiAssignmentsOnSelenium.Day10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day10_assignment_Testcase1 extends sauseBaseClass{
	
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException {
		//product page displayed
		FileInputStream fis1 = new FileInputStream("./src/test/java/capgeminiAssignmentsOnSelenium/Day10/sause.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String URL = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		@Nullable
		String Url = driver.getCurrentUrl();
		System.out.println("Url is : "+Url);
		if(Url.equals(URL)) {
			System.out.println("Product page is displayed");
		}
		else {
			System.out.println("product page is not displayed");
		}
		Thread.sleep(1000);
		
		//add to cart
		SauseProductPagePom sp = new SauseProductPagePom(driver);
		sp.getAddcart();
		Thread.sleep(1000);
		
		//cart contains 1 
		sauseCartPom c = new sauseCartPom(driver);
		String NoOfProduct = c.getCartContains();
		Thread.sleep(1000);
		if(NoOfProduct.equals("1")) {
			System.out.println("1 item is added to cart");
		}
		else {
			System.out.println("more than 1 item is added to cart");
		}
		Thread.sleep(1000);
		
		//click on cart
		c.getCartClick();
		Thread.sleep(1000);
		
		//product displayed or not
		WebElement bag = c.getProductContain();
		if(bag.isDisplayed()) {
			System.out.println("Product is added to cart");
		}
		else {
			System.out.println("Product is not added");
		}
		Thread.sleep(1000);
		
		
		
	}
	@Test
	public void oredrPlacemeng() throws EncryptedDocumentException, IOException, InterruptedException   {
		Thread.sleep(2000);
//		//add to cart
		SauseProductPagePom sp = new SauseProductPagePom(driver);
//		sp.getAddcart();
//		Thread.sleep(3000);
		sp.getCartClick();
		Thread.sleep(1000);
		
//		//click on cart
//		sauseCartPom c1 = new sauseCartPom(driver);
//				c1.getCartClick();
				
		
		//click on checkout
				SauseCheckoutpom ch = new SauseCheckoutpom(driver);
				ch.getCheckout();
		System.out.println("im in orderplacement ");
		Thread.sleep(1000);
		
		FileInputStream fis1 = new FileInputStream("./src/test/java/capgeminiAssignmentsOnSelenium/Day10/sause.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String FIRSTNAME = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String LASTNAME = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		//String POSTALCODE = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(FIRSTNAME);
		SauseCheckoutpom co = new SauseCheckoutpom(driver);
		co.getFn(FIRSTNAME);
		Thread.sleep(1000);
		co.getLn(LASTNAME);
		Thread.sleep(1000);
		co.getPcode("583231");
		Thread.sleep(1000);
		co.getContinuebutton();
		Thread.sleep(1000);
		System.out.println("clicked on continue");
		
		//checout verification
		
		@Nullable
		String checkoutpage = driver.getCurrentUrl();
		if(checkoutpage.equals("https://www.saucedemo.com/checkout-step-two.html")) {
			System.out.println("checkout is displayed");
		}
		else{
			System.out.println(" checkout is not displayed");
		}
		Thread.sleep(1000);
		//finish
		co.getFinishclick();
//		//order
		SauseOrderpom so = new SauseOrderpom(driver);
		WebElement orderplaced = so.getOrderplaced();
		if(orderplaced.isDisplayed()) {
			System.out.println("Message is displayed ");
		}
		else {
			System.out.println("Message is not displayed");
		}
		
		Thread.sleep(3000);
	}
	

}
