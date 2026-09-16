package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\NandanSH\\eclipse-workspace\\Framework.v1\\src\\test\\resources\\configfiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		if(p.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		else if(p.getProperty("browser").equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}
}
