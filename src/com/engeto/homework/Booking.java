package com.engeto.homework;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private int countOfGuests;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private List<Guest> otherGuests;


    //Konstruktor

    public Booking(Room room, Guest guest, int countOfGuests, LocalDate dateFrom, LocalDate dateTo, List<Guest> otherGuests) {
        this.room = room;
        this.guest = guest;
        this.countOfGuests = countOfGuests;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.otherGuests = otherGuests;
    }
    public Booking(Room room, Guest guest, int countOfGuests, LocalDate dateFrom, LocalDate dateTo) {
        this.room = room;
        this.guest = guest;
        this.countOfGuests = countOfGuests;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
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

    @Override
    public String toString() {
        return "Booking:" +
                "room:" + room +
                ", guest:" + guest +
                ", count of guests: " + countOfGuests +
                ", dateFrom:" + dateFrom +
                ", dateTo:" + dateTo +
                ", otherGuests:" + otherGuests;
    }
}
