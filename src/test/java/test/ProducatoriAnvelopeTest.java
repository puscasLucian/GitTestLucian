package test;


import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Edge;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import driverConfiguration.DriverHelper;
import epneuMenuObjects.ProducatoriAnvelopePageObject;
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

public class ProducatoriAnvelopeTest extends DriverHelper {

    public ProducatoriAnvelopePageObject producatoriPage;

    public ProducatoriAnvelopeTest() {
       producatoriPage = new ProducatoriAnvelopePageObject();
    }

    @Before
    public void setupTest() {
        setup();
    }

    @Test
    public void navigateProducatori() {
        producatoriPage.selectProducatori();
    }

    @After
    public void tearDown() {
        closeDriverInstance();
    }
}
