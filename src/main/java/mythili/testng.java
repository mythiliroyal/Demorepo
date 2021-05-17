package mythili;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng {
	@Test
	
	public void mn()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.voyaah.com/#/");
		
		System.out.println("th");
	}
}


