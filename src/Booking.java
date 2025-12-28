package com.hotel.model;

import com.hotel.model.enums.BookingStatus;
import java.time.LocalDate;
import java.util.Objects;

public class Booking {

    private int id;
    private Guest guest;
    private Room room;
    private LocalDate from;
    private LocalDate to;
    private double totalPrice;
    private BookingStatus status;

    public Booking(int id, Guest guest, Room room,
                   LocalDate from, LocalDate to, double totalPrice) {
        this.id = id;
        this.guest = guest;
        this.room = room;
        this.from = from;
        this.to = to;
        this.totalPrice = totalPrice;
        this.status = BookingStatus.CONFIRMED;
    }

    public Room getRoom() { return room; }
    public LocalDate getFrom() { return from; }
    public LocalDate getTo() { return to; }

    public void cancel() {
        status = BookingStatus.CANCELLED;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", guest=" + guest.getName() +
                ", room=" + room.getNumber() +
                ", from=" + from +
                ", to=" + to +
                ", total=" + totalPrice +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return id == booking.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
