package com.solvd.carina.demo.api.fakeRestAPI;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${api_url}api/v1/Activities/${id}", methodType = HttpMethodType.DELETE)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@ResponseTemplatePath(path = "api/fakeRestAPI/activities/delete/delete_activities_by_id_rs.json")
@RequestTemplatePath(path = "api/fakeRestAPI/activities/delete/delete_activities_by_id_rq.json")
public class DeleteActivities extends AbstractApiMethodV2 {

    public DeleteActivities(int id) {
        replaceUrlPlaceholder("api_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}
