package com.example.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Super",8,12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        //Showing shallow copy concept
        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")){
            System.out.println("Seat Reserved");
        }else{
            System.out.println("Seat already reserved"); //this part is run
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing Seat Copy");
        printList(seatCopy); //this is shuffle
        System.out.println("Printing Theatre.seat Copy");
        printList(theatre.seats); //this is not shuffle

        sortList(seatCopy);
        System.out.println("Printing Sorted List");
        printList(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("========================================================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}
