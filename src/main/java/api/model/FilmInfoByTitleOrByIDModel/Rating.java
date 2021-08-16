package api.model.FilmInfoByTitleOrByIDModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Source",
        "Value"
})
public class Rating {

    @JsonProperty("Source")
    public String source;
    @JsonProperty("Value")
    public String value;
}
