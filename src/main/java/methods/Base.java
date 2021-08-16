package methods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Base
{
    @Before
    public void setUp() throws Exception
    {
        RestAssured.baseURI="http://www.omdbapi.com/";
    }


    @After
    public void tearDown()
    {

    }
}
