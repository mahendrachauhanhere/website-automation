package Testcase;
import org.testng.annotations.Test;
import ObjectFile.Home_page2;
import Utils.TestBase;

public class Verified_SignIn_Testcase extends TestBase {
	
	@Test
	public void Verified_Sign_In_Page() throws InterruptedException {
		Home_page2 page = new Home_page2(driver);
		page.SignIn();
	}
}