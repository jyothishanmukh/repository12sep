package seleniumpractice;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class practicinglists {



	public static void main(String[] args) throws InterruptedException {

	// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

    WebDriver driver=new ChromeDriver();
    WebDriverWait wdw= new WebDriverWait(driver,Duration.ofSeconds(5));
	wdw.until(ExpectedConditions.alertIsPresent());
	
  
	String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	Thread.sleep(2000);
	//h4.product-name
	 addtheitems(itemsNeeded,driver);
		//	Assert.assertTrue(added);
	
	 
	 System.out.println("does this work?");
	 
	 System.out.println(driver.findElement(By.xpath("//div[@class='cart-info']//td[3]")).getText());
	driver.findElement(By.cssSelector("a.cart-icon")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	//(div.cart-info td):nth-child(3)
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	private static void addtheitems(String[] itemsNeeded, WebDriver driver) throws InterruptedException	
 
	{
	int i; String vegname=null;
	List<WebElement> veggies = driver.findElements(By.cssSelector("h4.product-name"));
	ArrayList<String> veggiesnameonsite = new ArrayList<String>();
	
	
	 System.out.println(veggies.size());
	
	 for(i=0;i<itemsNeeded.length;)
		{  
		 vegname= itemsNeeded[i];   
		  //System.out.println("vegetable name from list "+ vegname);
	        		 
	       for(int j=0;j<veggies.size();j++)
	    	   
		   {      
	    	   WebElement veg = veggies.get(j);
			     if(veg.getText().contains(vegname))
		        {	
			       
		          // WebElement we= driver.findElement(By.xpath("//h4[contains(text(),vegname)]/parent::div/div[3]/button"));
		           driver.findElements(By.xpath("//div[@class='product-action']/button")).get(j).click();
	                // we.click();
		             //Thread.sleep(2000);
		             System.out.println( "vegetable name on site"   +veg.getText());
		             vegname=itemsNeeded[i++];
		 		     //
		 		     break;
		 		     
	              }
		       //
		     
		
	     }
		
	      //// if(i==itemsNeeded.length)
			  //return true;
	}
	Thread.sleep(3000);
	//driver.quit();


	
	}

	
	}

	


