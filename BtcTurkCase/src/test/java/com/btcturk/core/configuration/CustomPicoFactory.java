package com.btcturk.core.configuration;

import com.btcturk.Application;
import cucumber.runtime.java.picocontainer.PicoFactory;

public class CustomPicoFactory extends PicoFactory {

    public CustomPicoFactory() {
        Application.initialize();
    }
}