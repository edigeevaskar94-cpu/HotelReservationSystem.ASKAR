package com.hotel.model;

import java.util.Objects;

public class Guest {

    private int id;
    private String name;
    private boolean loyalCustomer;

    public Guest(int id, String name, boolean loyalCustomer) {
        this.id = id;
        this.name = name;
        this.loyalCustomer = loyalCustomer;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public boolean isLoyalCustomer() { return loyalCustomer; }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loyalCustomer=" + loyalCustomer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return id == guest.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
