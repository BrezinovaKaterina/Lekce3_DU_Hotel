package com.engeto.homework;

import java.time.LocalDate;

public class Guest {
    private String guestFirstName;
    private String guestLastName;
    private LocalDate guestBirthDate;

    //region Konstruktor (guest)

    public Guest(String guestFirstName, String guestLastName, LocalDate guestBirthDate) {
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
        this.guestBirthDate = guestBirthDate;
    }

    //endregion

    //region Getter and Setter

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public void setQuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public LocalDate getGuestBirthDate() {
        return guestBirthDate;
    }

    public void setGuestBirthDate(LocalDate guestBirthDate) {
        this.guestBirthDate = guestBirthDate;
    }

    //endregion


    @Override
    public String toString() {
        return "Guest Name:" + guestFirstName +" "+ guestLastName +
                ", BirthDate:" + guestBirthDate +
                '}';
    }
}
