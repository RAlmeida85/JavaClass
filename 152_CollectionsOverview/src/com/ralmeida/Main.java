package com.ralmeida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Olympia", 8, 10);
//        theater.getSeats();
//
        theater.reserveSeat("A09");
        theater.reserveSeat("A09");
        theater.reserveSeat("A20");

        // shared copy, same objects
//        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();
        theater.reserveSeat("D08");

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());

        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);


        // reverse and shuffle methods from Collections
//        Collections.reverse(theater.seats);
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy list (shuffled)");
//        printList(seatCopy);
//        System.out.println("Printing theater.seats (reversed)");
//        printList(theater.seats);
//
//        //Min and Max methods from Collections
//        Theater.Seat minSeat = Collections.min(seatCopy);
//        Theater.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number is " + minSeat.getSeatNumber());
//        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
//
//        // using sortList method created
//        sortList(seatCopy);
//        System.out.println("Printing seatCopy sorted");
//        printList(seatCopy);
    }

    public static void printList(List<Theater.Seat> list){
        for (Theater.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("====================================================================");
    }

//    public static void sortList(List<? extends Theater.Seat> list){
//        for (int i = 0; i < (list.size() - 1); i++){
//            for (int j = (i + 1); j < list.size(); j++){
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    // swap method from Collections
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
