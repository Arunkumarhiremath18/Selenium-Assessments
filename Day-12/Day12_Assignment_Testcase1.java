package capgeminiAssignmentsOnSelenium.Day12;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day12_Assignment_Testcase1 extends OrangeHrmBaseClass{
	@DataProvider
	public Object[][] vacancaiesDetails() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/java/capgeminiAssignmentsOnSelenium/Day12/Vacency.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		Object[][] obj = new Object[rowCount][3];
		for(int row = 1;row<=rowCount;row++) {
			obj[row-1][0]=sh.getRow(row).getCell(0).getStringCellValue();
			obj[row-1][1]=sh.getRow(row).getCell(1).getStringCellValue();
			obj[row-1][2]=sh.getRow(row).getCell(2).getStringCellValue();
		}
		return obj;
		
	}
	
	@Test(dataProvider = "vacancaiesDetails")
	public void testCase1(String vname,String Description,String HRmanager) throws InterruptedException, AWTException {
		//click on recuritment
		OrangeHrmHomePagepom h = new OrangeHrmHomePagepom(driver);
		h.getRecruitmrnt();
		//click on vacancies
		OrangehrmRecruitmentpom r = new OrangehrmRecruitmentpom(driver);
		r.getVac();
		//addbutton
		r.getAdd();
		//vname
		OrangeHrmVacanciespom v = new OrangeHrmVacanciespom(driver);
		v.getVname(vname);
		//job title
		v.getJobdd();
		v.getJobtitle();
		//description
		v.getDescription(Description);
		//hiring manager
		v.getHiringmanager(HRmanager);
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//no of positions
		v.getNoOfPositions();
		//save
		v.getSubmit();	
				//profileclick
				h.getProfie();
				Thread.sleep(2000);
				//logout
				h.getLogout();
				Thread.sleep(2000);
	}
	
	@DataProvider
	public Object[][] MyinfoDetails() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/java/capgeminiAssignmentsOnSelenium/Day12/myinfo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		Object[][] obj = new Object[rowCount][4];
		for(int row = 1;row<=rowCount;row++) {
			obj[row-1][0]=sh.getRow(row).getCell(0).getStringCellValue();
			obj[row-1][1]=sh.getRow(row).getCell(1).getStringCellValue();
			obj[row-1][2]=sh.getRow(row).getCell(2).getStringCellValue();
			obj[row-1][3]=sh.getRow(row).getCell(3).getStringCellValue();
		}
		return obj;
		
	}
	
	@Test(dataProvider ="MyinfoDetails")
	public void testcase2(String fn,String mn,String ln,String empid) throws InterruptedException {
		OrangeHrmHomePagepom h= new OrangeHrmHomePagepom(driver);
		System.out.println(fn +" "+ mn +" "+ ln +" "+ empid);
		h.getMyinfo();
		Thread.sleep(2000);
		
		orangehrmmyinfopom i = new orangehrmmyinfopom(driver);
		//fn
		i.getFirstname(fn);
		Thread.sleep(2000);
		//ln
		i.getLastname(ln);
		Thread.sleep(2000);
		//empid
		i.getEmployeeid(empid);
		Thread.sleep(2000);
		//save
		i.getSavebtn();
		Thread.sleep(2000);
		//profileclick
		h.getProfie();
		Thread.sleep(2000);
		//logout
		h.getLogout();
		Thread.sleep(2000);
		
	}
	@Test
	public void verification() throws InterruptedException {
		OrangeHrmHomePagepom h= new OrangeHrmHomePagepom(driver);
		h.getMyinfo();
		Thread.sleep(2000);
		//verification
		orangehrmmyinfopom i = new orangehrmmyinfopom(driver);
		String fn = i.getFirstname();
		String ln = i.getLastname();
		System.out.println(fn +" "+ln);
		Assert.assertEquals(fn , "Rohan");
		Assert.assertEquals(ln, "Hiremath");
		OrangeHrmHomePagepom h1= new OrangeHrmHomePagepom(driver);
				//profileclick
				h1.getProfie();
				Thread.sleep(2000);
				//logout
				h1.getLogout();
				Thread.sleep(2000);
	}

}
