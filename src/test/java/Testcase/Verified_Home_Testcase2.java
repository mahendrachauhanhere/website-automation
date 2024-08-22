package Testcase;
import org.testng.annotations.Test;
import ObjectFile.Home_page2;
import Utils.TestBase;

public class Verified_Home_Testcase2 extends TestBase {

	@Test
	public void Verified_Home_Page() throws InterruptedException {
		Home_page2 page = new Home_page2(driver);
		page.Home();
	}
}