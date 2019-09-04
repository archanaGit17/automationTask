import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AirlineMozilla {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\AutomationTask\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.copaair.com/en/web/gs#");
		driver.findElement(By.id("originSearchString")).sendKeys("San Francisco, US SFO");
		driver.findElement(By.xpath("(//input[@name='destinationSearchString'])[1]")).sendKeys("Panama, PA PTY");
		driver.findElement(By.id("flightBooking_tripType_OW")).click();
		driver.findElement(By.id("flightBooking_date_from_btn")).click();
		driver.findElement(By.id("id_from2_date_1192019")).click();
		
		driver.findElement(By.id("flightBooking_cabinClass_Business")).click();
		driver.findElement(By.id("flightBooking_flexibleSearch_true")).click();
		WebElement a=driver.findElement(By.id("flightBooking_adults"));
		Select s=new Select(a);
		s.selectByValue("1");
		driver.findElement(By.id("flightBooking_search")).click();
		System.out.println("yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='flying-focus_target']")).click();
		driver.findElement(By.id("pgButtonNext")).click();
		driver.findElement(By.id("insurancePurchaseNo")).click();
		driver.findElement(By.id("pgButtonNext")).click();
		
		WebElement title1=driver.findElement(By.id("travellersInfo[0].title"));
		s=new Select(title1);
		s.selectByValue("MISS");
		driver.findElement(By.id("travellersInfo[0].firstName")).sendKeys("archana");
		driver.findElement(By.id("travellersInfo[0].lastName")).sendKeys("subbian");
	    driver.findElement(By.id("travellersInfo[0].genderFemale")).click();
	
	    WebElement month=driver.findElement(By.id("travellersInfo[0].advancedPassengerDetails(dobMonth)"));
	    s=new Select(month);
		s.selectByVisibleText("Jan");
	    WebElement day=driver.findElement(By.id("travellersInfo[0].advancedPassengerDetails(dobDay)"));
	    s=new Select(day);
		s.selectByValue("17");
	    WebElement year=driver.findElement(By.id("travellersInfo[0].advancedPassengerDetails(dobYear)"));
	    s=new Select(year);
		s.selectByValue("1995");
		driver.findElement(By.id("emailAddress")).sendKeys("archanasubbian22@gmail.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("archanasubbian22@gmail.com");
		driver.findElement(By.id("travellersInfo[0].homePhone.phoneNumberCountryCode")).sendKeys("044");
		driver.findElement(By.id("travellersInfo[0].homePhone.phoneNumber")).sendKeys("23701102");
		driver.findElement(By.id("travellersInfo[0].mobilePhone.phoneNumberCountryCode")).sendKeys("91");
		driver.findElement(By.id("travellersInfo[0].mobilePhone.phoneNumber")).sendKeys("9003261856");
		driver.findElement(By.id("pgButtonProceed")).click();
		driver.findElement(By.xpath("//a[@class='skipSelectionLink flying-focus_target']")).click();
		driver.findElement(By.xpath("//a[@class='button1 flying-focus_target']")).click();
		driver.findElement(By.xpath("//a[@class='button1 flying-focus_target']")).click();
		WebElement c=driver.findElement(By.id("creditCard.type"));
		s=new Select(c);
		s.selectByVisibleText("VISA");
		
	}

}
