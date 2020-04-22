package com.ralmeida;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1; i <=100; i++){
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes!");

        // bulk operations are destructive, it means will modify set
        // in below example duplicate values are ignored, resulting in a set of 196 values
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements!");

        // retainAll method will hold only the itens present on both sets
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements!");

        // printing the intersection
        for (int i : intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }


        // getting Asymmetric by creating one set and removing another set from it
        // i.e.: below first example remove elements that contains in divine from nature
        // and nature keeps only the difference (asymmetric)
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"all", "nature", "is", "out", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        // java coletion does not provide method to get symetric difference
        // you can create new set and remove intersection to get it
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference:");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        // containsAll method ca be used to check if a set is subset of another
        if(nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }

        if (nature.containsAll(intersectionTest)){
            System.out.println("intersectionTest is a subset of nature");
        }

        if (divine.containsAll(intersectionTest)){
            System.out.println("intersectionTest is a subset of divine");
        }
    }

    private static void printSet(Set<String> set){
        System.out.print("\t");
        for (String s : set){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
