package test;


import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Edge;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import driverConfiguration.DriverHelper;
import epneuMenuObjects.ContactPageObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;

//region Browser Configuration
@RunWith(WebDriverRunner.class)
@InternetExplorer(platform = Platform.WINDOWS)
@Chrome(platform = Platform.WINDOWS)
@Edge(platform = Platform.WINDOWS)
@Firefox(platform = Platform.WINDOWS)
//endregion

public class ContactTest extends DriverHelper {
    public ContactPageObject contactPage;

    public ContactTest() {
        contactPage = new ContactPageObject();
    }


    @Before
    public void setupTest() {
        setup();
    }

    @Test
    public void navigateContact() {
        contactPage.contactFormRgistration();
    }

    @After
    public void tearDown() {
        closeDriverInstance();
    }


}
