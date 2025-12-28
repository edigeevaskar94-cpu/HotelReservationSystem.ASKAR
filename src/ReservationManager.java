package com.hotel.service;

import com.hotel.model.*;
import com.hotel.model.enums.RoomType;
import com.hotel.payment.PaymentMethod;
import com.hotel.util.SearchCriteria;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ReservationManager {

    private List<Room> rooms = new ArrayList<>();
    private List<Guest> guests = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public void seedData() {
        rooms.add(new Room(1, "101", RoomType.STANDARD, 100, 2));
        rooms.add(new Room(2, "201", RoomType.DELUXE, 180, 3));
        rooms.add(new Room(3, "301", RoomType.SUITE, 300, 4));

        guests.add(new Guest(1, "Askar", true));
        guests.add(new Guest(2, "Araylim", false));
    }

    public List<Room> searchRooms(SearchCriteria criteria) {
        return rooms.stream()
                .filter(r -> r.getType() == criteria.type)
                .filter(r -> isAvailable(r, criteria.from, criteria.to))
                .collect(Collectors.toList());
    }

    private boolean isAvailable(Room room, LocalDate from, LocalDate to) {
        return bookings.stream()
                .filter(b -> b.getRoom().equals(room))
                .noneMatch(b ->
                        !(b.getTo().isBefore(from) || b.getFrom().isAfter(to))
                );
    }

    public Booking createBooking(int guestId, int roomId,
                                 LocalDate from, LocalDate to,
                                 PaymentMethod payment) {

        Guest guest = guests.stream().filter(g -> g.getId() == guestId).findFirst().orElseThrow();
        Room room = rooms.stream().filter(r -> r.getId() == roomId).findFirst().orElseThrow();

        long days = ChronoUnit.DAYS.between(from, to);
        double price = days * room.getPricePerNight();

        if (guest.isLoyalCustomer()) {
            price *= 0.9; // скидка 10%
        }

        payment.pay(price);

        Booking booking = new Booking(bookings.size() + 1, guest, room, from, to, price);
        bookings.add(booking);

        return booking;
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }
}