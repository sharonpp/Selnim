package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
		WebDriver sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.get("https://jqueryui.com/draggable/");
		sp.switchTo().frame(sp.findElement(By.className("demo-frame")));
		System.out.println(sp.findElement(By.id("draggable")).isDisplayed());
		//sp.switchTo().defaultContent();
		sp.findElement(By.linkText("Resizable")).click();
	}

}
