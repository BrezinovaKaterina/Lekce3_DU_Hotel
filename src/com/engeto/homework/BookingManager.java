package com.engeto.homework;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> listOfBooking = new ArrayList<>();

    public void add(Booking newBooking){
        listOfBooking.add(newBooking);
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

    // Prvních 8 rekreačních rezervací


}
