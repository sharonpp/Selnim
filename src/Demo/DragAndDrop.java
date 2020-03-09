package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
		WebDriver sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.get("https://jqueryui.com/droppable/");
		sp.switchTo().frame(sp.findElement(By.className("demo-frame")));
		WebElement a=sp.findElement(By.id("draggable"));
				WebElement b=sp.findElement(By.id("droppable"));
	Actions at=new Actions(sp);
	at.dragAndDrop(a,b).build().perform();
	}

}
