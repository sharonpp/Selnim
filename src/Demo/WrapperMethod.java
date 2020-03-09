package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperMethod {
	WebDriver sp;
public void LaunchApp(String url)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
	sp=new ChromeDriver();
	sp.manage().window().maximize();
	sp.get(url);

	}
public void enterById(String loc,String val)
{
	sp.findElement(By.id(loc)).sendKeys(val);
}
public void ClickByXpath(String path)
{
	sp.findElement(By.xpath(path)).click();
	}
public void ClickByLinkText(String link)
{
	sp.findElement(By.linkText(link)).click();
	}

public void ScreenShot(String path1) throws IOException 
{
	  TakesScreenshot scrShot =(TakesScreenshot)sp;
	File File=scrShot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(File,new File(path1));
	}
public void CloseApp()
{
	sp.close();}
}

