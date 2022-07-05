package mavenTestNGHomework;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

@Log4j
public class BrowserHomework {

    ChromeDriver driver;

    private final String Facebook_URL = "https://www.facebook.com/";

    @BeforeTest
    public void setProperties() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        log.info("Initializing Chromedriver");
        driver = new ChromeDriver();
        driver.get(Facebook_URL);
    }

    @Test
    public void chromeDriverTest() {
        Assert.assertEquals(driver.getTitle(), "Facebook - Social media portals");
    }

    @Test
    public void chromeDriverTest2() {
        Assert.assertEquals(driver.getCurrentUrl(), Facebook_URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        log.info("Closing Chromedriver");
        log.debug("DEBUG: Closing");
        driver.close();
    }

}

