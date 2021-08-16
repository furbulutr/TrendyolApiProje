Feature: Film arama senaryolari

  Scenario: Film ara ve imdbId data kontrol
    Given By Search altinda "Harry Potter" ve "" yili icin arama yapilir ve "Harry Potter and the Sorcerer's Stone" filmin IMDB ID'si alinir.
    And Arama yapılan filmin ımdb Id'si ile arama yapılır.