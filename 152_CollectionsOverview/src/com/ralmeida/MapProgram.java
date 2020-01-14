package com.ralmeida;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        // creating a MAP which contains a key and a value
        Map<String, String> languages = new HashMap<>();

        // keys are unique and can only be added once
        // method put is used to added items to MAP
        languages.put("Java", "a compile high level, object-oriented, plataform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");

        // If you added a key that already exist, it will overwrite previous value
        // put method will return previous value for that key (null in case it does not exist before
        System.out.println(languages.put("BASIC", "Therein lies madness"));
        System.out.println(languages.put("BASIC", "Beginners All purpose Symbolic Instruction Code"));

        // method get(key) will return value
        System.out.println(languages.get("Java"));

        // you can use containsKey to test if a key already exist in MAP
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "this course is about Java"));
        }

        System.out.println("=====================================");

        // you can use method remove and use as parameter key or key, value
        if (languages.remove("Algol", "a wrong value for this key")){
            System.out.println("Key/value found and removed");
        } else {
            System.out.println("Not able to remove, key/value not found");
        }

        languages.remove("Algol");


        // you can use method replace to replace a value for a given key
        // and the return will be the previous value
        System.out.println(languages.replace("BASIC", "Beginners All purpose Symbolic Instruction Code (value replaced)"));
        System.out.println(languages.replace("Scala", "not added yet, so replace will not work"));

        // you can use method keySet() to get all keys in a MAP
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
