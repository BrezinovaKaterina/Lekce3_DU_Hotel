import com.engeto.homework.Booking;
import com.engeto.homework.Guest;
import com.engeto.homework.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. Vytvoření hostů a výpis na obrazovku
        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        List<Guest> otherGuests = new ArrayList<>();
        otherGuests.add(guest1);

        System.out.println(guest1.getGuestFirstName()+" "+guest1.getGuestLastName()+" ("+guest1.getGuestBirthDate()+")");
        System.out.println(guest2.getGuestFirstName()+" "+guest2.getGuestLastName()+" ("+guest2.getGuestBirthDate()+")");

        System.out.println("***");

        //2. Vytvoření pokojů, výpis na obrazovku + popis
        Room room1 = new Room (1,1,true,true,1000);
        Room room2 = new Room (2,1,true,true,1000);
        Room room3 = new Room (3,3,false,true,2400);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        System.out.println(roomList);

        System.out.println("***");

        //3. Booking
        Booking booking1 = new Booking (room1,guest1,1, LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
        Booking booking2 = new Booking (room3, guest2,2, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), otherGuests);

        List<Booking> listOfBooking = new ArrayList<>();
        listOfBooking.add(booking1);
        listOfBooking.add(booking2);

        for (Booking booking : listOfBooking) {
            System.out.print(
                    "Detail rezervace: číslo pokoje: " + booking.getRoom().getRoomNumber()
                            + ", Host: " + booking.getGuest().getGuestLastName() + " " + booking.getGuest().getGuestFirstName()
                            + ", počet hostů: " + booking.getCountOfGuests()
                            + ", rezervace od: " + booking.getDateFrom() + ", rezervace do:" + booking.getDateTo()
                            + ", other guest: "+ booking.getOtherGuests());
            System.out.println();
        }
    }
}
