package pl.globallogic.streams_practice;

import java.util.*;

public class FilmProcessing {

    public static void main(String[] args) {

        Collection<Film> movieList = new HashSet<>();
        movieList.add(new Film("Constantine","Keanu Reeves",2005,121,7.0,"Fantasy", List.of("Keanu Reeves" , "Dark Fantasy", "WarnerBros", "Action movie")));
        movieList.add(new Film("The Flintstones","John Goodman",1994,91,4.9,"Family", List.of("Stones","Family movie","rock","bam bam")));
        movieList.add(new Film("The Lord of the Rings: The Fellowship of the Ring","Elijah Wood",2001,178,8.8,"Adventure", List.of("Adventure","Wizard","Ring","One does not simply walk into mordor","Fellowship")));
        movieList.add(new Film("The Lord of the Rings: The Two Towers","Elijah Wood",2002,179,8.7,"Adventure", List.of("Fantasy","Wizards","Towers")));
        movieList.add(new Film("The Lord of the Rings: The Return of the King","Elijah Wood",2003,201,8.9,"Adventure",List.of("Fantasy", "Rings","Kings","Wizards")));
        movieList.add(new Film("The Room","Tommy Wiseau",2003,99,3.7,"Drama",List.of("Best Comedy","Disaster","Room","Weird movie","Twisted Action","Dramas")));

        for (Film print:
                movieList) {
            System.out.println(print);
        }
    }
}
