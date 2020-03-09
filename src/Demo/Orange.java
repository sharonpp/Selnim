package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
	WebDriver sp=new ChromeDriver();
	sp.get("http://opensource-demo.orangehrmlive.com/");
	sp.manage().window().maximize();
	sp.findElement(By.id("txtUsername")).sendKeys("Admin");
	sp.findElement(By.id("txtPassword")).sendKeys("admin123");
	sp.findElement(By.className("button")).click();
/*	sp.findElement(By.className("firstLevelMenu")).click();
	sp.findElement(By.id("btnAdd")).click();*/
	sp.findElement(By.id("welcome")).click();
	sp.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
	}}
	

