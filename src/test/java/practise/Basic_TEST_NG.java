package practise;

import org.testng.annotations.Test;

/*Open application
 * click submit
 * close Application
 */
public class Basic_TEST_NG {
	@Test(priority=1)
	void openApp(){
		System.out.println("Opening APP");
		}
	
	@Test(priority=2)
	void clickSubmit() {
		System.out.println("The form has been submitted");
	}
	
	@Test(priority=3)
	void closeApplication() {
		System.out.println("Application Closed");
	}	

}
