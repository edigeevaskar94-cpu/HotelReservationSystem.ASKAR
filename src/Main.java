public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(101, "Single", 50.0, true);
        Room room2 = new Room(102, "Double", 80.0, true);

        Guest guest1 = new Guest("Askar", "KZ2008", "87471571182");

        Booking booking1 = new Booking(room1, guest1, 3);

        System.out.println(room1);
        System.out.println(room2);
        System.out.println(guest1);
        System.out.println(booking1);

        if (room1.getPrice() > room2.getPrice()) {
            System.out.println("Room 101 is more expensive than Room 102");
        } else {
            System.out.println("Room 102 is more expensive than Room 101");
        }
    }
}
