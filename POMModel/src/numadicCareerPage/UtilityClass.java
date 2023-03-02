package numadicCareerPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static void screenshot(WebDriver d,String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)d;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File path=new File("F:\\D\\Software testing\\My docs\\Selenium\\Selenium\\screenshot\\"+name+".jpg");
		FileHandler.copy(source, path);
	}

}
