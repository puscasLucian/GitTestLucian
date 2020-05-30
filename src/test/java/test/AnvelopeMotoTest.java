package test;


import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Edge;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import driverConfiguration.DriverHelper;
import epneuMenuObjects.AnvelopeMotoPageObject;
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

public class AnvelopeMotoTest extends DriverHelper {

    public AnvelopeMotoPageObject anvMotoPage;

    public AnvelopeMotoTest() {
        anvMotoPage = new AnvelopeMotoPageObject();
    }

    @Before
    public void setupTest() {
        setup();
    }

    @Test
    public void navigateAnvMotoPret() {
        anvMotoPage.searchAnvelopeMotoPret();

    }

    @After
    public void tearDown() {
        closeDriverInstance();
    }


}
