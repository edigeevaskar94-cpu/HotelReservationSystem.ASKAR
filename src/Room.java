package com.hotel.model;

import com.hotel.model.enums.RoomType;
import java.util.Objects;

public class Room {

    private int id;
    private String number;
    private RoomType type;
    private double pricePerNight;
    private int capacity;

    public Room(int id, String number, RoomType type, double pricePerNight, int capacity) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
    }

    public int getId() { return id; }
    public String getNumber() { return number; }
    public RoomType getType() { return type; }
    public double getPricePerNight() { return pricePerNight; }
    public int getCapacity() { return capacity; }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", type=" + type +
                ", price=" + pricePerNight +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return id == room.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}