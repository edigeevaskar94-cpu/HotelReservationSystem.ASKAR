package com.hotel;

import com.hotel.model.enums.RoomType;
import com.hotel.payment.CardPayment;
import com.hotel.service.ReservationManager;
import com.hotel.util.SearchCriteria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ReservationManager manager = new ReservationManager();
        manager.seedData();

        SearchCriteria criteria = new SearchCriteria(
                RoomType.DELUXE,
                LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 1, 15)
        );

        System.out.println("Available rooms:");
        manager.searchRooms(criteria).forEach(System.out::println);

        System.out.println("\nBooking...");
        manager.createBooking(
                1,
                2,
                LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 1, 15),
                new CardPayment()
        );

        System.out.println("\nAll bookings:");
        manager.getAllBookings().forEach(System.out::println);
    }
}