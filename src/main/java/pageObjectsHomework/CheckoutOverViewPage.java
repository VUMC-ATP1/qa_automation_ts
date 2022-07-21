package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverViewPage {

    private final By finishButton = By.id("finish");
    private final WebDriver driver;

    public CheckoutOverViewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void finishButtonClick() {
        driver.findElement(finishButton).click();
    }
}

