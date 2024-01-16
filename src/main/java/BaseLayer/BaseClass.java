package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public static void intilization()
	{
		WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com/signup");
	}

}
