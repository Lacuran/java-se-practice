package Sekcja12.Lesson.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapLesson {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")){
            System.out.println("Java id already in the map");
        } else {
            languages.put("Java", "a compiled high level, mlem mlem mlem");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programing language");
        languages.put("Algol", "Algorithmic language");
        languages.put("BASIC", "Beginers All purposes Symbolic");
        languages.put("Lisp", "This is Madness");

        if (languages.containsKey("Java")){
            System.out.println("Java id already in the map");
        } else {
            languages.put("Java","This is new course in java");
        }
        System.out.println();
        System.out.println("=========================");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "Algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Lisp", "Something something something Dark Side replace feature"));

        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
