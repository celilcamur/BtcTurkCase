package com.btcturk.steps.btcturk;

import com.btcturk.pages.*;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BtcTurkSteps {
    private BtcPage btcPage;
    private double highPrice;
    private double lowPrice;

    public BtcTurkSteps(BtcPage btcPage) {
        this.btcPage = btcPage;
    }

    public void navigate() throws InterruptedException {
        btcPage.navigateControl();
    }

    @When("^I navigate home page$")
    public void ıLogin() throws InterruptedException {
        navigate();
    }

    @When("^I check the login$")
    public void ıCheckTheLogin(){

    }


    @When("^I get the prices$")
    public void iGetThePrices(){
        getPrice();
    }

    @When("^I compare the high and low price$")
    public void iCompareTheHighAndLowPrice(){
        priceControl();
    }

    @When("^I change ticker$")
    public void iChangeTicker() throws InterruptedException{
        tickerChange();
    }

    public void getPrice(){
        highPrice = Double.parseDouble(btcPage.getHighPrice().replace(",","."));
        lowPrice = Double.parseDouble(btcPage.getLowPrice().replace(",","."));
        System.out.println(highPrice);
        System.out.println(lowPrice);
    }

    public void priceControl() {
        Assert.assertTrue("High Price is not bigger than low price", highPrice > lowPrice);
    }

    public void tickerChange() {
        btcPage.tickerChange();
    }


}
