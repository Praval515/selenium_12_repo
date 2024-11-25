package AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySubscriptionCart$11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
		String url = driver.getCurrentUrl();
		if(url.contains("https://automationexercise.com/")) {
			System.out.println("its visible");
		}else {
			System.out.println("its not visible");
		}
		driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();
		WebElement footer = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollInToView(true)",footer );

	}

}
