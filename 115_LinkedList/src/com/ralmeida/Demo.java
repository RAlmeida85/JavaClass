package com.ralmeida;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
//
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Camberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Camberra");
        addInOrder(placesToVisit, "Adelaide");

        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Brisbane");
        printList(placesToVisit);


        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){

        Iterator<String> i = linkedList.iterator();

        // iterator.hasNext() will check if Iterator object has a next value
        while(i.hasNext()){

            // iterator.next() will return the current value and move iterator to next value
            System.out.println("Now visiting: " + i.next());
        }

        System.out.println("=======================");
    }


    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        // similar to Iterator, but to be used in a List object
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            // will compare the next item on the list to the newCity
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // equal, do not add
                System.out.println(newCity + " already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before the next city as it is greater (alphabeticly cames before)
                // as it already moved to next item, need to get back
                stringListIterator.previous();
                //ListIterator will add new item in current position
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0 ){
                // move on to next city to check
            }
        }

        // case while loop finish means new city needs to be added to the end of linkedList
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities on itenary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday over");
                    break;

                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("End of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println( "0 - to quit\n" +
                            "1 - go to next city\n"+
                            "2 - go to previous city\n" +
                            "3 - print menu options");
    }
}
