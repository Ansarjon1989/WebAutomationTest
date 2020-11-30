package com.ebay.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "credentials")
    public Object[][] getItmData() {
        return new Object[][]{{"Ansar"},{"Rakhmankulov"}};
    }

}
