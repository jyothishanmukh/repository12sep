package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class veggiesdynamicselection {
	
	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		//int i=0;
			
		String[] veggiestobeadded= {"Beetroot","carrot","Beans"};
		
		List<WebElement> cart= driver.findElements(By.cssSelector("h4.product-name"));
		
		System.out.println(cart.size());
		for(int i=0; i<cart.size();i++)
		{ 
			System.out.println(cart.get(i).getText());
			
		}
		
		
		
		
		
		
		
		String  veggiename;
		
		for(int j=0; j<veggiestobeadded.length;j++)
		{
		  veggiename=veggiestobeadded[j];
		
		for(int i=0; i<cart.size();i++)
		{   
			if (cart.get(i).getText().contains(veggiename))
			{
				System.out.println(cart.get(i).getText());
			List<WebElement> buttonaddtocart= driver.findElements(By.cssSelector("button[type='button']"));
			WebElement wet= buttonaddtocart.get(i);
			wet.click();
			i++;
			break;
			}
			
		}
		
		
		
		
		}
		
	}
}




	
