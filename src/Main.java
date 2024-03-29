import com.engeto.homework.Booking;
import com.engeto.homework.BookingManager;
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

        printRoomDescription(roomList);

        System.out.println("***");

        //3. Booking
        Booking booking1 = new Booking (room1,guest1,1, LocalDate.of(2021,7,19),LocalDate.of(2021,7,26), "pracovní pobyt");
        Booking booking2 = new Booking (room3, guest2,2, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), otherGuests, "rekreační pobyt");

        List<Booking> listOfBooking = new ArrayList<>();
        listOfBooking.add(booking1);
        listOfBooking.add(booking2);

        System.out.println("");
        System.out.println("*** LEKCE 3 - EVIDENCE REZERVACÍ ***");

        Guest guest3 = new Guest("Karel", "Dvořák", LocalDate.of(1990,5,15));
        Guest guest4 = new Guest("Karel", "Dvořák", LocalDate.of(1979,1,3));
        Guest guest5 = new Guest("Karolína", "Tmavá",LocalDate.of(1970,11,24));

        Booking booking3 = new Booking(room3, guest3, 1, LocalDate.of(2023,6,1), LocalDate.of(2023,6,7), "pracovní pobyt");
        Booking booking4 = new Booking(room2, guest4, 1, LocalDate.of(2023,7,18), LocalDate.of(2023,7,21), "rekreační pobyt");
        Booking booking5 = new Booking(room3, guest5,1, LocalDate.of(2023,8,1), LocalDate.of(2023,8,31), "rekreační pobyt");

        listOfBooking.add(booking3);
        listOfBooking.add(booking4);
        listOfBooking.add(booking5);


         printDetailOfReservation(listOfBooking);

        System.out.println("");
        System.out.println("*** BOOKING MANAGER ***");

        fillBookings(listOfBooking, room2, guest5);
        BookingManager bookingManager = new BookingManager();
        bookingManager.addAll(listOfBooking);

        System.out.println("");
        printDetailOfReservation(listOfBooking);
        System.out.println("");
        printAllReservation(listOfBooking);

        System.out.println("Počet pobytů: "+bookingManager.countOfBooking());
        System.out.println("Průměr hostů na rezervaci: "+bookingManager.getAverageGuests());

        System.out.println("");

        System.out.println("Prvních 8 rezervací na rekreační pobyt:");
        int limit = 8;
        int orderOfReservation = 1;
        for (Booking booking : bookingManager.printRecreationalReservations()) {
            if (orderOfReservation <= limit) {
            System.out.print(orderOfReservation
                    +") " +booking.getGuest().getGuestLastName()+" "+booking.getGuest().getGuestFirstName()
                    +", od: " +booking.getDateFrom() + " do: "+booking.getDateTo() + "\n");
            orderOfReservation++;
            }
        }
        System.out.println();

        System.out.println("***"+"\n");

        System.out.println("Statistika dle počtu hostů:");
        System.out.println("Celkový počet rezervací s jedním hostem: "+bookingManager.printOneGuest());
        System.out.println("Celkový počet rezervací se dvěma hosty: "+bookingManager.printTwoGuests());
        System.out.println("Celkový počet rezervací s více než dvěma hosty: "+bookingManager.printMoreGuests());

        System.out.println("***"+"\n");
        printTotalPriceOfBooking(listOfBooking);
    }

    private static void printTotalPriceOfBooking(List<Booking> listOfBooking) {
        System.out.println("Celková cena pobytu:");
        int i = 0;
        for (Booking booking : listOfBooking){
            System.out.print(
                    "Číslo pokoje: " +booking.getRoom().getRoomNumber()
                            + ", cena za noc: " +booking.getRoom().getPricePerNight()
                            + " Kč, od: " +booking.getDateFrom() +" do: "+booking.getDateTo()
                            + ", délka pobytu (ve dnech): "+booking.getBookingLength()
                            + " cena celkem: " + booking.getPrice() + "Kč.");
                    i++;
            System.out.println();
        }
    }


    private static void fillBookings(List<Booking> listOfBooking, Room room2, Guest guest5) {
        int count = 10;
        LocalDate startDate = LocalDate.of(2023,6,1);
        LocalDate endDate = startDate.plusDays(1);
        for (int i = 0; i < count; i++) {
            System.out.print(listOfBooking.add(new Booking(room2, guest5, 1, startDate, endDate,"rekreační pobyt")));
            startDate = startDate.plusDays(2);
            endDate = startDate.plusDays(1);
        }
    }


    private static void printRoomDescription(List<Room> roomList) {
        System.out.println("Popis pokojů: ");
        for (Room rooms : roomList){
            System.out.print(
                    "Číslo pokoje: " +rooms.getRoomNumber()
                    + ", počet lůžek: " + rooms.getCountOfBed()
                    + ", balkon: " +rooms.isBalcony()
                    + ", výhled na moře: " +rooms.isSeaView()
                    + ", cena za noc: " + rooms.getPricePerNight() + " Kč.");
            System.out.println();
        }
    }

    private static void printDetailOfReservation(List<Booking> listOfBooking) {
       System.out.println("Detail rezervací: ");
        for (Booking booking : listOfBooking) {
            System.out.print(
                    "Číslo pokoje: " + booking.getRoom().getRoomNumber()
                            + ", Host: " + booking.getGuest().getGuestLastName() + " " + booking.getGuest().getGuestFirstName()
                            + ", datum narození: " +booking.getGuest().getGuestBirthDate()
                            + ", počet hostů: " + booking.getCountOfGuests()
                            + ", rezervace od: " + booking.getDateFrom()
                            + ", rezervace do:" + booking.getDateTo()
                            + ", typ rezervace: " + booking.getTypeOfVacation()
                            + ", other guest: "+ booking.getOtherGuests());
            System.out.println();
        }
    }
    private static void printAllReservation(List<Booking> listOfBooking) {
        System.out.println("Detail rezervací dle zadání: ");
        for (Booking booking : listOfBooking) {
            Room rooms;
            System.out.print(
                    booking.getDateFrom() + " do " + booking.getDateTo() + ": "
                            + booking.getGuest().getGuestFirstName() + " " + booking.getGuest().getGuestLastName()
                            + "(" +booking.getGuest().getGuestBirthDate() + ") ["
                            + booking.getCountOfGuests() + ", "
                            + booking.getRoom().isBalcony() + "] za " + booking.getRoom().getPricePerNight() + " Kč.");
            System.out.println();
        }
    }
}
