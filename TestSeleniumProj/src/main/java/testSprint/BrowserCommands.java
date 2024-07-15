package testSprint;

public class BrowserCommands extends Base{
public void browserCommands() {
	String title=driver.getTitle(); // these are the methods in webdriver
	System.out.println(title);// to get the title or tabname
	String url=driver.getCurrentUrl(); // to get current url
	System.out.println(url);
	String pagesource=driver.getPageSource();// to get the html code
	System.out.println(pagesource);
	
}
	public static void main(String[] args) {
		
		BrowserCommands browsercommands= new BrowserCommands();
		browsercommands.initializeBrowser(); // first call initializebrowser
		browsercommands.browserCommands();
		browsercommands.driverQuitandClose();// call it finally
		
	}

}
