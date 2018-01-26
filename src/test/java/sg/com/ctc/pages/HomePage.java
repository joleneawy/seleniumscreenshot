package sg.com.ctc.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/")
public class HomePage extends PageObject{
	
	WebDriver driver;
	
	public void accessPage(String url) {
		try {
			getDriver().navigate().to(url);
			Thread.sleep(1000);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
