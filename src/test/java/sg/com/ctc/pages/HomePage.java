package sg.com.ctc.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("/")
public class HomePage extends PageObject{
	
	WebDriver driver;
	
	@WhenPageOpens
	public void maximiseScreen() {
	    getDriver().manage().window().maximize();
	}
	
	public void accessPage(String url) {
		try {
			getDriver().navigate().to(url);
			Thread.sleep(1000);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
