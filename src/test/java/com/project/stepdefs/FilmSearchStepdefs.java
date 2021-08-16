package com.project.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import methods.DataVerify;

public class FilmSearchStepdefs {

    @Given("By Search altinda {string} ve {string} yili icin arama yapilir ve {string} filmin IMDB ID'si alinir.")
    public void bySearchAltındaVeYılıIçinAramaYapılırVeFilminIMDBIDSiAlınır(String filmTitle, String year, String desiredFilm) {

        DataVerify dataVerify = new DataVerify();
        dataVerify.getFilmByTitle(filmTitle, year, desiredFilm);
    }

    @Then("Arama yapılan filmin ımdb Id'si ile arama yapılır.")
    public void aramaYapılanFilminImdbIdSiIleAramaYapılır() {
        DataVerify dataVerify = new DataVerify();
        dataVerify.searchWithID();
    }

}
