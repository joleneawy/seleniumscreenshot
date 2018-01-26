package sg.com.ctc.steps;

import net.thucydides.core.annotations.Step;
import sg.com.ctc.pages.HomePage;

public class AccessSteps {
	
	HomePage homePage;
	
	@Step
    public void access(String url) {
		homePage.accessPage(url);
    }
}
