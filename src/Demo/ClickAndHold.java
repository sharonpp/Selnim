package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
		WebDriver sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.get("https://jqueryui.com/selectable/");
		sp.switchTo().frame(sp.findElement(By.className("demo-frame")));
		WebElement a=sp.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));	
		WebElement b=sp.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement c=sp.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		
		Actions at=new Actions(sp);
		at.clickAndHold(a).clickAndHold(b).clickAndHold(c).release().build().perform();

	}
}
