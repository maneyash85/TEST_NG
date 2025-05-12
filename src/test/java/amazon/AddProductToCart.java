package amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddProductToCart {
	@FindBy(how=How.ID,using="a-autoid-1-announce")
	private WebElement cart;
	
	@FindBy(how=How.ID,using="nav-cart-count")
	private WebElement checkCart;
	
	public AddProductToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	void addProduct(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cart);
		cart.click();
	}
	
	String productAdded(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,0);");
		return checkCart.getText();
		
	}
}
