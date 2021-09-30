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
        movieList.add(new Film("Deadpool","Ryan Reynolds",2016,108,8.0,"Comedy",List.of("Action","Super Heroes","Marvel","Comedy")));
        movieList.add(new Film("The Hitman Bodyguard","Ryan Reynolds",2017,118,6.9,"Action",List.of("Comedy","Bodyguard","MotherFucker","Samuel L.Jackson")));
        movieList.add(new Film("Donnie Darko","Jake Gyllenhaal",2001,113,8.0,"Mystery",List.of("Mystery","Drama","Sci-Fi","Big Creepy Rabbit")));
        movieList.add(new Film("The Boys","Karl Urban",2019,60,8.7,"Action",List.of("Super Heroes", "Bad Boys","Drama","Amazon","Dating Sim Simulator")));
        movieList.add(new Film("Invincible","Steven Yeun",2021,60,8.7,"Action",List.of("Animation","Brutal","Super Heroes")));
        movieList.add(new Film("South Park","Eric Cartman",1997,20,8.7,"Comedy",List.of("Animation","Comedy","Satire")));
        movieList.add(new Film("Venom","Tom Hardy",2018,112,6.7,"Action",List.of("Marvel","Super Heroes","Comedy","Sci-fi")));
        movieList.add(new Film("Love, Death & Robots","Scott Whyte",2019,20,8.5,"Action",List.of("Drama","Animation","Comedy","Shorts","Sci-fi")));
        movieList.add(new Film("Escape Room: Tournament of Champions","Taylor Russell",2021,88,5.8,"Horror",List.of("Action","Horror","Escape Room","Adventure","Dating Sim Simulator")));

        int i = 1;
        for (Film print:
                movieList) {
            String ranking = i + ". " + print;
            System.out.println(ranking);
            i++;
        }
    }
}
