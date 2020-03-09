package sant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
	WebDriver sp=new ChromeDriver();
	sp.manage().window().maximize();
	sp.get("http://demowebshop.tricentis.com/");
	
	
	sp.findElement(By.id("small-searchterms")).sendKeys("book");
	sp.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	sp.findElement(By.name("As")).click();
	WebElement wb =sp.findElement(By.id("Cid"));
	Select sel=new Select(wb);
	sel.selectByVisibleText("Jewelry");
	sp.findElement(By.id("Pf")).sendKeys("1000");
	sp.findElement(By.id("Pt")).sendKeys("5000");
	sp.findElement(By.name("Isc")).click();

	}

}
