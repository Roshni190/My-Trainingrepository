package testSprint;

public class NavigationCommands extends Base{
	public void navigationMethods() {
		driver.navigate().to("https://www.amazon.in/");// to navigate from one site to other site or from one page to other
		driver.navigate().back();// to go back to other site
		driver.navigate().forward();// forward to next site
		driver.navigate().refresh();// to refresh
	}

	public static void main(String[] args) {
		NavigationCommands navigationcommands= new NavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.navigationMethods();
		navigationcommands.driverQuitandClose();
	}

}
