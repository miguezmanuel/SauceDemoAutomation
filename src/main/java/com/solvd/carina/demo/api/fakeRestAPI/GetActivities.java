package com.solvd.carina.demo.api.fakeRestAPI;

import com.zebrunner.carina.api.AbstractApiMethodV2;

import java.util.Properties;

public class GetActivities extends AbstractApiMethodV2 {

    public GetActivities(String rqPath, String rsPath, Properties properties) {
        super(rqPath, rsPath, properties);
    }
}
