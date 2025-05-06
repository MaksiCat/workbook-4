public class main {
    public static void main(String[] args) {

        System.out.println("=== ROOM DEMO ===");
        Room room101 = new Room(2, 120.0, false, false);

        room101.checkIn();
        room101.checkOut();
        room101.cleanRoom();
        room101.checkIn();


        System.out.println("\n=== EMPLOYEE DEMO ===");
        Employee emp = new Employee("E001", "Alice", "Housekeeping", 18.5, 0);

        emp.punchIn(10.0);
        emp.punchOut(12.5);

        emp.punchIn();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        emp.punchOut();

        System.out.println("Regular hours: " + emp.getRegularHours());
        System.out.println("Overtime hours: " + emp.getOvertimeHours());
        System.out.println("Total pay: $" + emp.getTotalPay());

        System.out.println("\n=== HOTEL DEMO ===");
        Hotel myHotel = new Hotel("Ocean View", 5, 10);

        System.out.println("Available Suites: " + myHotel.getAvailableSuites());
        System.out.println("Available Rooms: " + myHotel.getAvailableRooms());

        boolean booked1 = myHotel.bookRoom(3, true);  // Забронировать 3 люкса
        boolean booked2 = myHotel.bookRoom(5, false); // Забронировать 5 обычных

        System.out.println("Booking suites success: " + booked1);
        System.out.println("Booking rooms success: " + booked2);
        System.out.println("Available Suites: " + myHotel.getAvailableSuites());
        System.out.println("Available Rooms: " + myHotel.getAvailableRooms());

        boolean overbook = myHotel.bookRoom(10, false);
        System.out.println("Overbooking attempt: " + overbook);
    }
}
