package pl.globallogic.streams_practice;
/*
*Create a package called streams_practice in your exercise repo
Create class Film with next fields (constructor, getters/setters):
String title
int duration (in minutes)
Double imdbRate
String genre
List<String> searchKeywords
Feel free to add any additional info you want)
Create a watchlist of 15 films. Use imdb.com and filmweb.pl to create film entities.
Create a class FilmProcessing with the main method
Perform next operations using Java Stream class and its methods
Filter films with a duration greater than the specified value
Return list of film titles in UPPER CASE
Filter all films of a particular genre and with IMDb rate lower than specified value
Find the first film of a particular genre
Return a list of IMDb rates sorted in descending order
Return top-3 films sorted by IMDb rate
Return a total watch list duration
Return the longest film in a list
Return true if any of the films in a watch list satisfies criteria (ex. Have “horror” in search keywords list)
Return list of films with a common search keyword
For your custom film field from 2.f create 3 queries (filter, findAny/First, map, etc…)
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Film {
    private String title;
    private String mainActor;
    private int yearOfPremiere;
    private int duration;
    private double imdbRate;
    private String genre;
    private List<String> searchKeywords;

    public Film(String title,String mainActor,int yearOfPremiere, int duration, double imdbRate, String genre, List<String> searchKeywords) {
        this.title = title;
        this.mainActor = mainActor;
        this.yearOfPremiere = yearOfPremiere;
        this.duration = duration;
        this.imdbRate = imdbRate;
        this.genre = genre;
        this.searchKeywords = searchKeywords;
    }

    public List<String> getSearchKeywords() {
        return this.searchKeywords;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public String getGenre() {
        return genre;
    }

    public String getMainActor() {
        return mainActor;
    }

    public int getYearOfPremiere() {
        return yearOfPremiere;
    }

    @Override
    public String toString() {
        return String.format("\tFilm title: '%s', Main Actor: %s, Premiere: %s, duration: %s min, imdb Rate: %s, genre: '%s', Search Keywords: %s\n",title,mainActor,yearOfPremiere,duration,imdbRate,genre,searchKeywords);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return yearOfPremiere == film.yearOfPremiere && duration == film.duration && Double.compare(film.imdbRate, imdbRate) == 0 && Objects.equals(title, film.title) && Objects.equals(mainActor, film.mainActor) && Objects.equals(genre, film.genre) && Objects.equals(searchKeywords, film.searchKeywords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, mainActor, yearOfPremiere, duration, imdbRate, genre, searchKeywords);
    }
}
