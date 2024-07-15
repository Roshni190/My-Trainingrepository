		package checkbox;
		
		import java.util.ArrayList;
		import java.util.List;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		
		import testSprint.Base;
		
		public class TableHandlingHeader extends Base {
			
			public void tableRowPrinting() { 
			}
			
			//	List <String> expectedTitles=List.of("Name","Position","Office","Age","Start date","Salary");
				//System.out.println(expectedTitles);
				
				//driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
				//List<WebElement>actualtitle=driver.findElements(By.xpath("//tr[@role='row']"));
				//List<String>actualtitle1=new ArrayList<String>();
			//	Object expectedTitles1;
				//for(String actual:actualtitle1)
				//	System.out.println(actual.getText());
			/*	if(actual.getText().equals(expectedTitles1)){
					System.out.println(actual.getText());	
					System.out.println("Both are same");
				}
				else
				{
					System.out.println("Fail");
				}
					
				
			}*/
			public static void main(String[] args) {
				TableHandlingHeader tablehandlingHeader=new TableHandlingHeader();
				tablehandlingHeader.initializeBrowser();
				tablehandlingHeader.tableRowPrinting();
			}
		
		}
