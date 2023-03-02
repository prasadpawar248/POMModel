package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_VerifyLogin 
{
	public static void main (String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.facebook.com/");
		obj.manage().window().maximize();
		
		obj.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("prasadpawar248@gmail.com");
		obj.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("prasad123");
		obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		System.out.println(obj.getTitle());
		

	}

}
