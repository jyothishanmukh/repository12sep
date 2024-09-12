package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class angularpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.name("name"));
		WebElement email= driver.findElement(By.name("email"));	
		WebElement pwd=  driver.findElement(By.id("exampleInputPassword1"));
		//exampleCheck1
		WebElement checkbox=  driver.findElement(By.id("exampleCheck1"));
		
		WebElement gender=driver.findElement(By.cssSelector(".form-control option"));
		WebElement empstatus= driver.findElement(By.xpath("//input[@name='inlineRadioOptions'][1]"));
		
		WebElement dob= driver.findElement(By.xpath("//input[@name='bday']"));
		
		name.sendKeys("sfasdgadsg");
		email.sendKeys("kokrishn@gmail.com");
		pwd.sendKeys("fghhghjk");
		checkbox.click();
		gender.click();
		empstatus.click();
		dob.sendKeys("09/09/2001");
		
		WebElement submit=driver.findElement(By.cssSelector(".btn.btn-success"));
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
		
		WebElement submitmsg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(submitmsg.getText());
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select abc = new Select(dropdown);

		abc.selectByVisibleText("Female");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
