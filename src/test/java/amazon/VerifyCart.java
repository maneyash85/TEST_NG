package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyCart {
	
	WebDriver driver;
	Homepage home;
	AddProductToCart cart;
	First5Products prod;
	
//	@FindBy
	
	@BeforeClass
	void DriverSetup()
	{
		driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		home=new Homepage(driver);
		cart=new AddProductToCart(driver);
		prod=new First5Products(driver);
			
	}
	
	@Test
	void VerifyTheProd(){
		home.Search();
		home.filterBrand(driver);		
		cart.addProduct(driver);
		prod.getProducts();
		String cartCheck=cart.productAdded(driver);
		Assert.assertEquals(cartCheck, "1");
	}
	@AfterClass
	void closeBrowser() {
		driver.quit();
	}


}
