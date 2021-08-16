package api.Body;

import methods.Parameters;
import io.restassured.response.Response;
import methods.Base;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class ResponseBody extends Base {
    public static Response responseBySearch(String paramTitle, String paramYear) {
        return given().
                param(Parameters.API_KEY.getData(), "5343c842").
                param(Parameters.FILM_NAME.getData(), paramTitle).
                param(Parameters.TYPE.getData(), "movie").
                param(Parameters.YEAR.getData(), paramYear).
                param(Parameters.DATA_TYPE.getData(), "json").
                param(Parameters.PAGE.getData(), "1").
                param(Parameters.CALLBACK.getData(), "").
                param(Parameters.APIVERSION.getData(), "1")
                .and()
                .when().get(baseURI).then().extract().response();
    }

    public static Response responseByID(String paramID) {
        return given().
                param(Parameters.API_KEY.getData(), "5343c842").
                param(Parameters.ID.getData(), paramID).
                param(Parameters.TITLE.getData(), "").
                param(Parameters.TYPE.getData(), "").
                param(Parameters.YEAR.getData(), "").
                param(Parameters.PLOT.getData(), "short").
                param(Parameters.DATA_TYPE.getData(), "json").
                param(Parameters.CALLBACK.getData(), "").
                param(Parameters.APIVERSION.getData(), "1")
                .and()
                .when().get(baseURI).then().extract().response();

    }
}
