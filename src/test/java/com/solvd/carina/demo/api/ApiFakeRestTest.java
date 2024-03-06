package com.solvd.carina.demo.api;

import com.solvd.carina.demo.api.fakeRestAPI.DeleteActivities;
import com.solvd.carina.demo.api.fakeRestAPI.GetActivities;
import com.solvd.carina.demo.api.fakeRestAPI.PostActivity;
import com.solvd.carina.demo.api.fakeRestAPI.PutActivity;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class ApiFakeRestTest implements IAbstractTest {

    @Test
    public void getActivitiestTest () {
        GetActivities getActivities = new GetActivities();
        getActivities.callAPIExpectSuccess();
        getActivities.validateResponseAgainstSchema("api/fakeRestAPI/activities/get/schema/get_activities_rs.json");
    }

    @Test
    public void deleteActivitiesByIdTest () {
        DeleteActivities deleteActivities = new DeleteActivities(1);
        deleteActivities.callAPIExpectSuccess();
    }

    @Test
    public void postActivityTest () {
        PostActivity postActivity = new PostActivity();
        postActivity.callAPIExpectSuccess();
        postActivity.validateResponse();
    }

    @Test
    public void putActivityTest () {
        PutActivity putActivity = new PutActivity(1);
        putActivity.callAPIExpectSuccess();
        putActivity.validateResponse();
    }
}
