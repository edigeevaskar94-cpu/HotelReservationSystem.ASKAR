public class Booking {

    private Room room;
    private Guest guest;
    private int nights;
    private double totalPrice;

    public Booking(Room room, Guest guest, int nights) {
        this.room = room;
        this.guest = guest;
        this.nights = nights;
        this.totalPrice = room.getPrice() * nights;
        room.bookRoom();
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public int getNights() {
        return nights;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


    public String toString() {
        return "Booking{" +
                "room=" + room +
                ", guest=" + guest +
                ", nights=" + nights +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
