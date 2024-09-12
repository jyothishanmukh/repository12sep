package seleniumpractice;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	

public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(5000);

		int year=2027;
		String month="10";
		String dat= "23";
		String date=dat+'/'+month+'/'+year;
		System.out.println(date);
		WebElement calendaricon= driver.findElement(By.cssSelector("button.react-date-picker__calendar-button.react-date-picker__button"));
		calendaricon.click();
		WebElement calendaryear= driver.findElement(By.className("react-calendar__navigation__label"));
		calendaryear.click();
		driver.findElement(By.className("react-calendar__navigation")).click();
		
		Thread.sleep(5000);
		List<WebElement> years= driver.findElements(By.xpath("//div[@class='react-calendar__decade-view__years']/button"));
	//	Iterator<WebElement> it = years.iterator();
		for (WebElement we: years)
		{   System.out.println(we.getText());
			if (Integer.parseInt((we).getText())==year)
			{	we.click();
			Thread.sleep(5000);
			
			List<WebElement> months= driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']"));
			months.get(Integer.parseInt(month)).click();
			Thread.sleep(5000);
			}
						
			
			}
			
		}
				
		
		
		//driver.findElement(By.xpath("//div[@class='react-calendar__decade-view__years']/button[text()='2026']")).click();
		
		
		
		
		
		
	}		


