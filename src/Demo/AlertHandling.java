package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
		WebDriver sp=new ChromeDriver();
		sp.manage().window().maximize();
		sp.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do;jsessionid=A477B8CB2223B1C25154ADF53C50A52B");
		sp.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[3]/input")).click();;
		Alert a=sp.switchTo().alert();
		System.out.print(a.getText());
		a.accept();
		sp.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/input")).sendKeys("sharon");
		sp.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[2]/input")).sendKeys("sharon");
		sp.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[3]/input")).click();;

		//		a.dismiss();
//		a.sendKeys("");
//		a.accept();
	}
}
