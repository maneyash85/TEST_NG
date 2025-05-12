package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Contact {

	
	WebDriver driver;
	
	@BeforeClass
	void Setup() {
	driver=new EdgeDriver();
	driver.navigate().to("https://webapps.tekstac.com/AddressBook/");
	driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void PassValues() {
		driver.findElement(By.id("nickname")).sendKeys("Sarvesh");
		driver.findElement(By.id("contact")).sendKeys("1234567654");
		driver.findElement(By.id("company")).sendKeys("Cognizant");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("type")).sendKeys("xyz");
		driver.findElement(By.id("add")).click();
	}
	
	@Test(priority=2)
	void getValues()
	{
		System.out.println(driver.findElement(By.xpath("//div[@id='result']/descendant::tr[2]/td[1]")).getText());
	}
	
}
