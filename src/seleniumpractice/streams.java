package seleniumpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class streams {
	
	
public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		
	//String url=https:'//rahulshettyacademy.com //seleniumPractise/#/offers");
		Thread.sleep(5000);
List<String> ls=Arrays.asList("jyothi","venkat","chandrika","daddy","amma","lokesh");

System.out.println(ls.stream().count());
System.out.println(ls.stream().distinct().count());
List<String> ls1= ls.stream().sorted().collect(Collectors.toList());
System.out.println(ls1.get(0));
System.out.println(ls1.get(1));
System.out.println(ls1.get(2));

	}

}
