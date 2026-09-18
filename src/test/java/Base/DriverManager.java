package Base;
import org.openqa.selenium.WebDriver;

public class DriverManager {

	static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static void setDriver(WebDriver driverInstance)
	{
		driver.set(driverInstance);
	}
	public static WebDriver getDriver() {
        return driver.get();
    }
}
