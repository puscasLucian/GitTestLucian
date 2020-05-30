package test;

import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Edge;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import driverConfiguration.DriverHelper;
import epneuMenuObjects.HomePageObjects;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;

//region Browser Configuration
@RunWith(WebDriverRunner.class)
@Chrome(platform = Platform.WINDOWS)
//@InternetExplorer(platform = Platform.WINDOWS)
//@Edge(platform = Platform.WINDOWS)
//@Firefox(platform = Platform.WINDOWS)
//endregion

public class HomeTest extends DriverHelper {

    public HomePageObjects homepage;

    public HomeTest() {
        homepage = new HomePageObjects();
    }


    @Before
    public void setupTest() {
        setup();
    }

    @Test
    public void navigateSearchMenuItems() {
        homepage.searchAnvelopeAutoPret();
        homepage.searchAnvelopeCamioanePret();

    }

    @After
    public void tearDown() {
        closeDriverInstance();
    }
}
