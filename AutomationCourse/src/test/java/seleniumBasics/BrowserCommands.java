package seleniumBasics;

public class BrowserCommands extends Base {
	public void BroswerCommands()
	
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String t=driver.getTitle();
		System.out.println(t);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
		
	public void navigationCommands()
	{
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browser=new BrowserCommands();
		browser.intializeBrowser();
	//	browser.BroswerCommands();
		browser.navigationCommands();
		
		browser.closeandquit();

	}

}
