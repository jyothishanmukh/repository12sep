package seleniumpractice;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class brokenlinks {
	
	

public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException
	
	{
		// TODO Auto-generated method stub
	   String uril;
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions a =new Actions(driver);
		a.scrollToElement(driver.findElement(By.xpath( "//a[contains(text(),'Medianh Consulting')]")));
		
		Thread.sleep(2000);
		List<WebElement> lo= driver.findElements(By.xpath("//*[@class=\" footer_top_agile_w3ls gffoot footer_style\"]//a"));
		for (WebElement ape: lo)

		{
		   uril= ape.getAttribute("href");
		   System.out.println(uril);
		  // URL u= ;
		 
		  
				
		  // Path path = Paths.get( "/New folder/urlishere.txt" ) ;
		 //  URI uri = path.toUri () ;
		  URL url= new URI(uril).toURL();
		   url.openConnection();
		 HttpURLConnection conn= (HttpURLConnection)url.openConnection();
		   conn.setRequestMethod("HEAD");
		   conn.connect();
		   int respcode=conn.getResponseCode();
		   System.out.println(respcode);
		   
		   
					
		}
}
	
	
	
}

