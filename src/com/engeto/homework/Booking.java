package com.engeto.homework;
import com.engeto.homework.Guest;
import com.engeto.homework.Room;

import java.awt.print.Book;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class Booking {
    private Room room;
    private Guest guest;
    private int countOfGuests;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private List<Guest> otherGuests;
    private String typeOfVacation;


    //Konstruktor

    public Booking(Room room, Guest guest, int countOfGuests, LocalDate dateFrom, LocalDate dateTo, List<Guest> otherGuests, String typeOfVacation) {
        this.room = room;
        this.guest = guest;
        this.countOfGuests = countOfGuests;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.otherGuests = otherGuests;
        this.typeOfVacation = typeOfVacation;
    }
    public Booking(Room room, Guest guest, int countOfGuests, LocalDate dateFrom, LocalDate dateTo, String typeOfVacation) {
        this.room = room;
        this.guest = guest;
        this.countOfGuests = countOfGuests;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.typeOfVacation = typeOfVacation;
    }

    //Gettery a Settery


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public int getCountOfGuests() {
        return countOfGuests;
    }

    public void setCountOfGuests(int countOfGuests) {
        this.countOfGuests = countOfGuests;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public double getBookingLength() {
        LocalDate start = dateFrom;
        LocalDate end = dateTo;
        long daysBetween = ChronoUnit.DAYS.between(start, end);
        return daysBetween;
    }

    public double getPrice(){
        double priceTotal;
        priceTotal = getRoom().getPricePerNight()*getBookingLength();
        return priceTotal;
    }


    @Override
    public String toString() {
        return "Booking:" +
                "room: " + room +
                ", guest: " + guest +
                ", count of guests: " + countOfGuests +
                ", dateFrom: " + dateFrom +
                ", dateTo: " + dateTo +
                ", otherGuests: " + otherGuests +
                ", type of vacation: " + typeOfVacation;

    }
}
