package Demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takesnap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jars\\chrome driver\\chromedriver.exe");
		WebDriver sp=new ChromeDriver();
		sp.get("http://opensource-demo.orangehrmlive.com/");
		sp.manage().window().maximize();
		sp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         TakesScreenshot scrShot =(TakesScreenshot)sp;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("D:\\SeleniumJF\\SeleniumJF\\Screenshot\\orange.png"));
	}

}
