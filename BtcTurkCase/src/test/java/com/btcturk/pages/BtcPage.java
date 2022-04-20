package com.btcturk.pages;

import com.btcturk.core.driver.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class BtcPage extends BtcTurkPageBase {

    @FindBy(css = "[class=\"pair-button ng-star-inserted\"]")
    private WebElement navigateControl;

    @FindBy(id = "ex-advanced-ticker-high")
    private WebElement highPrice;

    @FindBy(id = ("ex-advanced-ticker-low"))
    private WebElement lowPrice;

    @FindBy(id = "ex-basic-ticker-current")
    private WebElement tickerChange;

    @FindBy(css = "[placeholder=\"Arama\"]")
    private WebElement searchArea;

    @FindBy(css = "[class=\"menu-list ng-star-inserted\"] li")
    private List<WebElement> clickTicker;

    public BtcPage(WebDriver driver) {
        super(driver);
        setPath("basit/al-sat/BTC_TRY");
        navigate();
    }

    public void navigateControl() {
        waitUntilVisibleWebElement(navigateControl);
    }

    public String getHighPrice() {
        waitUntilVisibleWebElement(highPrice);
        return highPrice.getText();
    }

    public String getLowPrice() {
        waitUntilVisibleWebElement(lowPrice);
        return lowPrice.getText();
    }

    public void tickerChange() {
        waitUntilVisibleWebElement(tickerChange).click();
        waitUntilVisibleWebElement(searchArea).clear();
        searchArea.sendKeys("USDT");
        waitUntilVisibleWebElement(clickTicker.get(0)).click();
    }

}
