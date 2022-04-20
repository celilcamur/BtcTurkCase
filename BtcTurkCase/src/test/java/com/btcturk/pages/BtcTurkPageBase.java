package com.btcturk.pages;

import com.btcturk.core.driver.WebDriver;
import com.btcturk.core.pageobject.PageBase;

abstract class BtcTurkPageBase extends PageBase {

    BtcTurkPageBase(WebDriver driver) {
        super(driver);
        setBaseUrl("https://pro.btcturk.com");
    }


}
