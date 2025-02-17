package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void handlingLocators(){
	WebElement showMessageButton = driver.findElement(By.id("button-one"));
	driver.findElement(By.id("single-input-field"));
	driver.findElement(By.className("btn btn-primary"));
	driver.findElement(By.name("viewport"));
	driver.findElement(By.tagName("section"));
	driver.findElement(By.linkText("Simple Form Demo"));
	driver.findElement(By.partialLinkText("Simple"));
	driver.findElement(By.cssSelector("button[id='button-one']"));
	driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
	driver.findElement(By.xpath("//label[@for='inputEmail4']"));
	driver.findElement(By.xpath("//section[@class='clearfix']"));
	driver.findElement(By.xpath("//button[text()='Show Message']"));
	driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locators locator=new Locators();
locator.intializeBrowser();
locator.handlingLocators();
locator.closeandquit();
	}

}
