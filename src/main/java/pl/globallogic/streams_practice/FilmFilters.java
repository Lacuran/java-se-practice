package pl.globallogic.streams_practice;

import java.util.*;
import java.util.stream.Collectors;

public class FilmFilters {

    public static List<Film> movieDuration(List<Film> movie,int duration){
        return movie.stream()
                .filter(m -> m.getDuration() > duration)
                .sorted(Comparator.comparingInt(Film::getDuration))
                .collect(Collectors.toList());
    }

    public static List<String> movieTitleToUpperCase(List<Film> movie){
        return movie.stream().map(m -> m.getTitle().toUpperCase()).collect(Collectors.toList());
    }

    public static List<Film> movieByGenreAndIMDb(List<Film> movie, String genre, double imdb){
        return movie.stream()
                .filter(m -> m.getGenre() == genre && m.getImdbRate() < imdb)
                .collect(Collectors.toList());
    }

    public static List<Film> movieByGenre(List<Film> movie, String genre){
        return movie.stream()
                .filter(m -> m.getGenre() == genre)
                .limit(1)
                .collect(Collectors.toList());
    }

    public static List<Film> IMDbRate(List<Film> movie){
        return movie.stream()
                .sorted(Comparator.comparingDouble(Film::getImdbRate).reversed())
                .collect(Collectors.toList());
    }

    public static List<Film> top3IMDbRate(List<Film> movie){
        return movie.stream()
                .sorted(Comparator.comparingDouble(Film::getImdbRate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
    public static int totalWatchListDuration(List<Film> movie){
        return movie.stream()
                .mapToInt(Film::getDuration).sum();
    }

    public static List<Film> longestMovie(List<Film> movie){
        return movie.stream()
                .sorted(Comparator.comparingInt(Film::getDuration).reversed())
                .limit(1)
                .collect(Collectors.toList());
    }

    public static boolean satisfiesCriteria(List<Film> movie,String movieTitle, String keyword){
        return movie.stream()
                .anyMatch(m -> m.getTitle().contains(movieTitle) && m.getSearchKeywords().contains(keyword));

    }

    public static List<Film> commonSearchKeyword(List<Film> movie,String keyword){
        return movie.stream()
                .filter(m -> m.getSearchKeywords().contains(keyword))
                .collect(Collectors.toList());
    }

    public static List<Film> searchByActor(List<Film> movie, String actorName){
        return movie.stream()
                .filter(m -> m.getMainActor() == actorName)
                .collect(Collectors.toList());
    }

    public static List<Film> movieListByYear(List<Film> movie, int year){
        return movie.stream()
                .filter(m -> m.getYearOfPremiere() > year)
                .collect(Collectors.toList());
    }

    public static List<Film> sortedMovieListByYear(List<Film> movie){
        return movie.stream()
                .sorted(Comparator.comparingInt(Film::getYearOfPremiere))
                .collect(Collectors.toList());
    }
}
