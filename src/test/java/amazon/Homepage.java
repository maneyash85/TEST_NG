package amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	private WebElement textBox;
	
	@FindBy(how=How.ID,using="nav-search-submit-button")
	private WebElement searchBox;
	
	@FindBy(how=How.XPATH,using="//a[@aria-label='See more, Brands']")
	private WebElement seeMore;
	
	@FindBy(how=How.XPATH,using="//span[text()='Samsung']")
	private WebElement filter;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	void Search() {
		textBox.sendKeys("Laptop");
		searchBox.click();
	}
	
	void filterBrand(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", seeMore);
		seeMore.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", filter);
	}
}
