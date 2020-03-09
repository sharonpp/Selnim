package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
		WebDriver sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.get("https://www.hdfcbank.com/");
		WebElement a=sp.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a"));
		WebElement b=sp.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/a/span[2]"));
		WebElement c=sp.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[3]/a/span"));
		Actions at=new Actions(sp);
		at.moveToElement(a).click();
		at.moveToElement(b).click();
		at.moveToElement(c).click();
	}

}
