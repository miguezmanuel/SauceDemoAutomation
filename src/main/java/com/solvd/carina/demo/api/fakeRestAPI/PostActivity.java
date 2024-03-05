package com.solvd.carina.demo.api.fakeRestAPI;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${api_url}api/v1/Activities", methodType = HttpMethodType.POST)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@RequestTemplatePath(path = "api/fakeRestAPI/activities/post/post_activity_rq.json")
@ResponseTemplatePath(path = "api/fakeRestAPI/activities/post/post_activity_rs.json")
public class PostActivity extends AbstractApiMethodV2 {

    public PostActivity() {
        replaceUrlPlaceholder("api_url", Configuration.getRequired("api_url"));
    }
}
