package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:/My Software/Eclipse/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.110.49");
	
		/*WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
		element.sendKeys("Vaibhav");
		
		element = driver.findElement(By.xpath("//input[@aria-label='Google Search']"));
		element.click();
		driver.close();*/
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.xpath("//a[@href='/Order/Home']"));
		element .click();
		WebElement element1 = driver.findElement(By.linkText("Search"));// .xpath("//a[@href='#search' @by]"));
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//input[@class='autocomplete alphanumericautocaps t-widget t-autocomplete t-input']"));
		element2.sendKeys("admau");
		
	//element.getText()
		
	}

}


