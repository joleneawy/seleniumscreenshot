package sg.com.ctc.features;

import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import sg.com.ctc.steps.AccessSteps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WhenUserAccessPage {
	
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	
	@Steps
    AccessSteps step;
	
	public static Properties props;
	
	@BeforeClass
    public static void setUp() throws Exception {
        props = new Properties();
        props.load(WhenUserAccessPage.class.getClassLoader().getResourceAsStream("setup.properties"));
    }
    
    @Test
    public void a_when_http_redirect_https_testcase_1() {
    	step.access(props.getProperty("testMainUrl"));
    }

}
