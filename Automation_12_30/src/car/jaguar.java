package car;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jaguar {
	
	@Test(groups = "smoke")
	public void launch() {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.jaguar.in/index.html");
		
		Reporter.log("jaguar launch sucessfully", true);
	}
	
	

}

