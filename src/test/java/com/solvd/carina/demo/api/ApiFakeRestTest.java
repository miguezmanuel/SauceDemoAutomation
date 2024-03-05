package com.solvd.carina.demo.api;

import com.solvd.carina.demo.api.fakeRestAPI.GetActivities;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class ApiFakeRestTest implements IAbstractTest {

    @Test
    public void getActivitiestTest () {
        GetActivities getActivities = new GetActivities();
        getActivities.callAPIExpectSuccess();
        getActivities.validateResponseAgainstSchema("api/fakeRestAPI/activities/schema/get_activities_rs.json");
    }
}
