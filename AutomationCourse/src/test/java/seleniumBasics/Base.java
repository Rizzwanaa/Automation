package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public WebDriver driver;
public void intializeBrowser() {
	
    driver=new ChromeDriver();
	//driver=new FirefoxDriver();
	//driver=new EdgeDriver();
	driver.get(" https://selenium.qabible.in/");
	driver.manage().window().maximize();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.intializeBrowser();

	}

}
