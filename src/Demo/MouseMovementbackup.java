package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementbackup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[4]/a")); //Creating a weblemet to store in object
		WebElement b=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[4]/ul/li[3]/a/span[2]"));
		Actions c= new Actions(driver);
		c.moveToElement(a).click();
		c.moveToElement(b).click().build().perform();//build set of actions like two or more perform is one action
	}



}

	


