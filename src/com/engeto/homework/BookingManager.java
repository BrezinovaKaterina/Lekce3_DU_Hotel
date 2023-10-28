package com.engeto.homework;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private static List<Booking> listOfBooking = new ArrayList<>();

    public void add(Booking newBooking){
        listOfBooking.add(newBooking);
    }
    public Booking get(int index) {
        return listOfBooking.get(index);
    }

    public void addAll(List<Booking> addBooking){
        listOfBooking.addAll(addBooking);
    }

    public int countOfBooking(){
        return listOfBooking.size();
    }

    public void clearBookings(){
        listOfBooking.clear();
    }

    public double getAverageGuests(){
       int totalGuests = 0;
        for (Booking booking : listOfBooking) {
            totalGuests += booking.getCountOfGuests();
        }
        return (double) totalGuests/countOfBooking();
    }

public static int getNumberOfWorkingBookings (){
    int numberOfWorkingBookings = 0;
        for (Booking booking : listOfBooking) {
            if (booking.getTypeOfVacation().equals("pracovní pobyt")){
                numberOfWorkingBookings++;
            }
        }
        return numberOfWorkingBookings;
    }
}