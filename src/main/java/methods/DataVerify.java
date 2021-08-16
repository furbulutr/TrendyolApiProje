package methods;

import api.Body.ResponseBody;
import api.model.GetFilmBySearch.GetFilmBySearch;
import api.model.GetFilmBySearch.Search;

import org.apache.http.HttpStatus;

import java.util.List;
import java.util.Objects;

import static org.hamcrest.CoreMatchers.equalTo;


public class DataVerify extends CommonLib {

    static String imdbID = null;


    public void getFilmByTitle(String paramTitle, String paramYear, String desiredFilm) {
        String response = ResponseBody.responseBySearch(paramTitle, paramYear).asString();
            GetFilmBySearch getFilmBySearch = CommonLib.getResponse(response, GetFilmBySearch.class); //classe kaydetme islemi yapılır
        List<Search> searches = Objects.requireNonNull(getFilmBySearch).search;
        for (Search search : searches) {
            if (search.title.equals(desiredFilm)) {
                imdbID = search.imdbID;
                System.out.println("imdIB ıd sı : " + imdbID);
            }
        }
    }

    public void searchWithID() {
        ResponseBody.responseByID(imdbID).then()
                .statusCode(HttpStatus.SC_OK).and()
                .body("Title", equalTo("Harry Potter and the Sorcerer's Stone")).and()
                .body("Year", equalTo("2001")).and()
                .body("Released", equalTo("16 Nov 2001"));
    }
}