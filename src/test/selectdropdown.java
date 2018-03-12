package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectdropdown {
	
	@Test
	public void getValues(){
		
		System.setProperty("webdriver.gecko.driver", "G:\\Neon\\gecko driver\\geckodriver.exe");
		WebDriver objDriver = new FirefoxDriver();
		objDriver.manage().window().maximize();
		objDriver.manage().deleteAllCookies();
		objDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		objDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objDriver.get("file:///C:/Users/krunal/Desktop/Selenium%20webpages/HTMLTag.html");
		Select objSelect = new Select(objDriver.findElement(By.id("selCity")));
		/*List<WebElement> objOptions = objSelect.getOptions();
		for (WebElement obj :objOptions )
		{
			System.out.println(obj.getText());
		}
		objSelect.selectByVisibleText("Ahmedabad");
		System.out.println("Selected option is " + objSelect.getFirstSelectedOption().getText()); */
		
		Actions objAction = new Actions(objDriver);
		objAction.moveToElement(objDriver.findElement(By.id("selCity"))).contextClick().perform();
		
		
	}

}
