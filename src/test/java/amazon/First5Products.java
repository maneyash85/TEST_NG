package amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class First5Products {
	
	@FindBy(how=How.XPATH,using="//div[@data-cy='title-recipe']")
	private List<WebElement> names;
	
	@FindBy(how=How.XPATH,using="//span[@class='a-price']/child::span[@aria-hidden='true']")
	private List<WebElement> price;

	public First5Products(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	void getProducts() {
		
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(names.get(i).getText());
			 System.out.println(price.get(i).getText());
		 }
		 
		
	}
}
