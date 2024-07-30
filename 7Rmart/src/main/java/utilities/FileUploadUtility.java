package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadUtility {
	//File upload using Robot class
	public void fileUploadRobotclass() throws AWTException {
		StringSelection ss = new StringSelection("C:\\Users\\Roshni\\Desktop\\test.pdf"); 
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); 
			Robot robot=new Robot(); 
			robot.delay(250); 
			robot.keyPress(KeyEvent.VK_ENTER); 
			robot.keyRelease(KeyEvent.VK_ENTER); 
		    robot.keyPress(KeyEvent.VK_CONTROL); 
			robot.keyPress(KeyEvent.VK_V); 
			robot.keyRelease(KeyEvent.VK_V); 
			robot.keyRelease(KeyEvent.VK_CONTROL); 
			robot.keyPress(KeyEvent.VK_ENTER); 
			robot.delay(90); 
			robot.keyRelease(KeyEvent.VK_ENTER);
						
	}
}
