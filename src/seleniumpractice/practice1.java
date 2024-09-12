package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com/droppable");
		Thread.sleep(2000);
		WebElement frame;
		frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement frameelement= driver.findElement(By.id("draggable"));
		
		WebElement targetele = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(frameelement, targetele).build().perform();
		
		
	}

}
