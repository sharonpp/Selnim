package sant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
		WebDriver sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.get("https://www.w3schools.com/html/html_tables.asp");
		
		int r,c;
		for(r=2;r<=7;r++)
		{
			for(c=1;c<=3;c++)
			{
		String xp=sp.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
		System.out.print(xp+" " );
	}
			System.out.println();
			}
		}

}
