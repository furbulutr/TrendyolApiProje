package api.model.GetFilmBySearch;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetFilmBySearch {

    @JsonProperty("Search")
    public List<Search> search = null;
    @JsonProperty("totalResults")
    public String totalResults;
    @JsonProperty("Response")
    public String response;

}
