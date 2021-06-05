package encapsulations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4main {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	FileInputStream fin=new FileInputStream("./excel/datas1.xlsx");
	
	Workbook wb=WorkbookFactory.create(fin);
	Sheet sh=wb.getSheet("Sheet1");
	
	for (int i = 1; i < sh.getPhysicalNumberOfRows(); i++) {
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		Tester4 test=new Tester4(driver);
		test.setUsername(username);
		test.setPassword(password);
		test.clickOnLogin();
		
		
	}
	
	

	}

} 
