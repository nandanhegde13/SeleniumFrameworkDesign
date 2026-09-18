package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPage {
	
	WebDriver driver;
	
	@FindBy(id="datepicker")
	WebElement textField;
	
	@FindBy(className="ui-datepicker-title")
	WebElement monthAndYear;
	
	@FindBy(id="ui-datepicker-div")
	WebElement calender;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy (xpath="//a[text()='13']")
	WebElement Date;
	
	public CalenderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void chooseDate(String givenDate,String givenMonth,String givenYear)
	{
		textField.click();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(calender));
		
		while(true)
		{
			String month = monthAndYear.getText().split(" ")[0].trim();
			String year = monthAndYear.getText().split(" ")[1].trim();
			if(month.equals(givenMonth) && year.equals(givenYear))
			{
			break;
			}
			nextButton.click();
		}
		
		Date.click();
		
		
	}
}
