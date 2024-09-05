package SeleniumFramework;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationScriptPage {
	WebDriver driver;
	
	@Test
	public void login() throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\RahulAvdheshYadav\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			driver = new ChromeDriver(); 
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath("//button[@id='details-button']")).click();
			
			
			  //Opens a new tab and switches to new tab
	     //   driver.switchTo().newWindow(WindowType.TAB);\
			
			
			String ele=driver.getTitle();
			 System.out.println(ele);
			String actual="Google";
	       Assert.assertEquals(actual, ele, "not found");
	       
	       System.out.println("Done");
	       Thread.sleep(9000);
	       driver.close();
	}}
	      
	       
	       
//	        
//			driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
//			
//			driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("nimivaid1@in.ibm.com");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("Mahfin@123");
//			Thread.sleep(1000);
//			
//			driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
//			
//			
//	        //Opens a new window and switches to new window
////	        driver.switchTo().newWindow(WindowType.WINDOW);
////	        assertEquals("",driver.getTitle());
//		
//		File file =    new File("C:\\Users\\RahulAvdheshYadav\\Downloads\\Esign Live Bank list February 2024_update_05_07.xlsx");
//		 FileInputStream inputStream = new FileInputStream(file);
//		 XSSFWorkbook wb=new XSSFWorkbook(inputStream);
//		 XSSFSheet sheet=wb.getSheet("Sheet5");
//		 int RowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
//		 
//		   for (int i = 1; i <= RowCount; i++) {
//	            XSSFRow row = sheet.getRow(i);
//	            if (row != null) {
//	                XSSFCell usernameCell = row.getCell(0);
//	                XSSFCell passwordCell = row.getCell(1);
//
//	                if (usernameCell != null && passwordCell != null) {
//	                    String username = usernameCell.getStringCellValue();
//	                    String password = passwordCell.getStringCellValue();
//
//	                    // Print fetched username and password (for debugging purposes)
//	                    System.out.println("Username: " + username);
//	                    System.out.println("Password: " + password);
//	                    
//	                    
//	                	
//	        				driver.findElement(By.xpath("//a[@class=\"toolbar-icon toolbar-icon-system-admin-content\"]")).click();
//	        				
//	        				driver.findElement(By.xpath("//button[@class='reset-appearance tabs__trigger']")).click();
//	        				
//	        				driver.findElement(By.xpath("(//a[@class='tabs__link js-tabs-link'])[1]")).click();
//	        				
//	        				driver.findElement(By.xpath("//a[@class=\"button button--action button--primary\"]")).click();
//	        				
//	        				
//	        				
//	        				driver.findElement(By.xpath("//input[@id=\"edit-title-0-value\"]")).sendKeys(password);
//	        				
//	        				driver.findElement(By.xpath("//input[@id=\"edit-field-bank-code-0-value\"]")).sendKeys(username);
//	        				
//	        				driver.findElement(By.xpath("//input[@id=\"edit-field-is-popular-value\"]")).click();
//	        				
//	        				Thread.sleep(2000);
//	        				
//	        				
//	        				driver.findElement(By.name("field_verification_option[0][subform][field_key_value_pair_data][0][key]")).sendKeys("option_id");
//	                    
//	                    
//	                    driver.findElement(By.name("field_verification_option[0][subform][field_key_value_pair_data][0][value]")).sendKeys("aadhaar");
//	                    Thread.sleep(2000);
//	                    
//	                    driver.findElement(By.xpath("//input[@name=\"field_verification_option_0_subform_field_key_value_pair_data_add_more\"]")).click();
//	                    
//	                    
//	                    
//	                    
//                   	driver.findElement(By.name("field_verification_option[0][subform][field_key_value_pair_data][1][key]")).sendKeys("option_name");
//	                    
//	                    
//	                    driver.findElement(By.name("field_verification_option[0][subform][field_key_value_pair_data][1][value]")).sendKeys("Aadhaar");
//	                    Thread.sleep(2000);
//	                    
//	                    driver.findElement(By.xpath("//input[@name=\"field_verification_option_0_subform_field_key_value_pair_data_add_more\"]")).click();
//	                    
//	                    
//	                    
//	                    
//	                   	driver.findElement(By.name("field_verification_option[0][subform][field_key_value_pair_data][2][key]")).sendKeys("is_recommended");
//		                    
//		                    driver.findElement(By.name("field_verification_option[0][subform][field_key_value_pair_data][2][value]")).sendKeys("false");
//		                    
//		                    Thread.sleep(2000);
//		                    
//		                 
//		                    
//		                    ///add key value
//		                    
//		                    driver.findElement(By.xpath("(//input[@class='field-add-more-submit button--small button js-form-submit form-submit'])[2]")).click();
//		                    
//		                    
//		                    Thread.sleep(2000);
//		                    
//		                    
//		                    
//		                	driver.findElement(By.name("field_verification_option[1][subform][field_key_value_pair_data][0][key]")).sendKeys("option_id");
//		                    
//		                    
//		                    driver.findElement(By.name("field_verification_option[1][subform][field_key_value_pair_data][0][value]")).sendKeys("upi");
//		                    Thread.sleep(2000);
//		                    
//		                    driver.findElement(By.name("field_verification_option_1_subform_field_key_value_pair_data_add_more")).click();
//		                    
//		                    
//		                    
//		                    
//	                   	driver.findElement(By.name("field_verification_option[1][subform][field_key_value_pair_data][1][key]")).sendKeys("option_name");
//		                    
//		                    
//		                    driver.findElement(By.name("field_verification_option[1][subform][field_key_value_pair_data][1][value]")).sendKeys("UPI");
//		                    
//		                    Thread.sleep(2000);
//		                    driver.findElement(By.name("field_verification_option_1_subform_field_key_value_pair_data_add_more")).click();
//		                    
//		                    
//		                    
//		                    
//		                    
//		                   	driver.findElement(By.name("field_verification_option[1][subform][field_key_value_pair_data][2][key]")).sendKeys("is_recommended");
//			                    
//			                    
//			                    driver.findElement(By.name("field_verification_option[1][subform][field_key_value_pair_data][2][value]")).sendKeys("false");
//			                    Thread.sleep(2000);
//			                    
//			                    
//			                    //save button
//			                    
//			                    driver.findElement(By.id("edit-submit--2--gin-edit-form")).click();	
//			                    Thread.sleep(2000);
//			                    
//			                  
//			                    
//			                    
//		                      
//	                }
//	                }
//	            } 
		 


						
			
			
			
		
		
	


