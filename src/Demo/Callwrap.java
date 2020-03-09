package Demo;

import java.io.IOException;

public class Callwrap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WrapperMethod wm=new WrapperMethod();
		wm.LaunchApp("https://opensource-demo.orangehrmlive.com/");
		wm.enterById("txtUsername", "Admin");
		wm.enterById("txtPassword", "admin123");
		wm.ClickByXpath("//*[@id=\"btnLogin\"]");
		wm.ClickByLinkText("Leave");
		wm.ScreenShot("D:\\\\SeleniumJF\\\\SeleniumJF\\\\Screenshot\\\\orange.png");
		wm.CloseApp();
	}

}
