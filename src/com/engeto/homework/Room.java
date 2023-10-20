package com.engeto.homework;

public class Room {
    private int roomNumber;
    private int countOfBed;
    private boolean balcony;
    private boolean seaView;
    private double pricePerNight;

    //region Konstruktor

    public Room(int roomNumber, int countOfBed, boolean balcony, boolean seaView, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.countOfBed = countOfBed;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    //endregion


    //region Gettery a Settery

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCountOfBed() {
        return countOfBed;
    }

    public void setCountOfBed(int countOfBed) {
        this.countOfBed = countOfBed;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }


    //endregion


    @Override
    public String toString() {
        return "Room number:" + roomNumber +
                ", countOfBed: " + countOfBed +
                ", balcony:" + balcony +
                ", seaView:" + seaView +
                ", price: " + pricePerNight+ " CZK/per night";

    }
}
