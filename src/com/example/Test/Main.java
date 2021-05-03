package com.example.Test;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Super",8,12562);
//        theatre.getSeats();

        if(theatre.reserveSeat("B545")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry Seat is Taken");
        }

        if(theatre.reserveSeat("H11")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry Seat is Taken");
        }

    }
}
