package com.catfact.logic;

import static io.restassured.RestAssured.given;

import com.catfact.utils.ApiUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BreedLogic {
    private static final Logger log = LoggerFactory.getLogger(BreedLogic.class);

    public Response listarBreads(String endpoint) {
        log.info("Iniciando requisição para o serviço \"" + ApiUtils.getProp("base.url") + endpoint + "\"");
        Response response = given().relaxedHTTPSValidation()
                .accept(ContentType.JSON).when().get(ApiUtils.getProp("base.url") + endpoint);

        log.info("Response Body: " + response.body().asString());

        return response;
    }
}
