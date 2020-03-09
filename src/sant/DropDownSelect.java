package sant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
	WebDriver sp =new ChromeDriver();
	sp.get("http://examples.codecharge.com/store/Default.php");
	
	
	
	WebElement wb= sp.findElement(By.name("category_id"));
	Select sel=new Select(wb);
			sel.selectByVisibleText("HTML & Web design");
	
	
	
	
	
	
	}

}
