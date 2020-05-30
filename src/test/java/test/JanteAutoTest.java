package test;


import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Edge;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import driverConfiguration.DriverHelper;
import epneuMenuObjects.AnvelopeMotoPageObject;
import epneuMenuObjects.JanteAutoPageObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

//region Browser Configuration
@RunWith(WebDriverRunner.class)
@InternetExplorer
@Chrome
@Edge
@Firefox
//endregion

public class JanteAutoTest extends DriverHelper {


    public JanteAutoPageObject janteAutoPage;

    public JanteAutoTest() {
        janteAutoPage = new JanteAutoPageObject();
    }

    @Before
    public void setupTest() {
        setup();
    }

    @Test
    public void searchJantePret() {

    }

    @After
    public void tearDown() {
        closeDriverInstance();
    }

}
