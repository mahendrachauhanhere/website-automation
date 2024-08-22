package Testcase;

import org.testng.annotations.Test;

import ObjectFile.Home_page2;
import Utils.TestBase;

public class Verified_Forgotpassword_Testcase extends TestBase {

	@Test
	public void Verified_Forgot_Testcase() throws InterruptedException {
		Home_page2 page = new Home_page2(driver);
		page.Forgotpasswords();
	}
}