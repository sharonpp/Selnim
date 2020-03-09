package sant;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
	WebDriver sp= new ChromeDriver();
	sp.manage().window().maximize();
	sp.get("http://demowebshop.tricentis.com/");

	List<WebElement> rb=sp.findElements(By.name("pollanswers-1"));
	((WebElement)rb.get(2)).click();//type casting
	
	
}
}
