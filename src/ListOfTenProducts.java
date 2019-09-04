import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfTenProducts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\AutomationTask\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 7 mobile phones");
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
		List<WebElement> l=driver.findElements(By.tagName("img"));
		int c=0;
		for(int i=0;i<l.size();i++)
		{
			WebElement d=l.get(i);
			List<WebElement> img=d.findElements(By.xpath("//img[@class='s-image']"));
			c=img.size();
		}
		System.out.println(c);
		if(c==10)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
