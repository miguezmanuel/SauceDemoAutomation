package com.solvd.carina.demo.api.fakeRestAPI;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

import java.util.Properties;

@Endpoint(url = "${api_url}/api/v1/Activities", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "test/resources/api/fakeRestAPI/activities/get_activities_rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetActivities extends AbstractApiMethodV2 {
    public GetActivities() {
        replaceUrlPlaceholder("api_url", Configuration.get("api_url").toString());
    }

}
