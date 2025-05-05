public class main {
    public static void main(String[] args) {
        // Test class Room
        Room room1 = new Room(2, 99.99, false, false);
        System.out.println("Room available: " + room1.isAvailable()); // true

        Room room2 = new Room(1, 129.99, true, true);
        System.out.println("Room available: " + room2.isAvailable()); // false

        // Test class Reservation
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Total cost: $" + reservation.getReservationTotal());

        // Test class Employee
        Employee emp = new Employee("E007", "Andrew", "Front Desk", 20.0, 45);
        System.out.println("Employee: " + emp.getName());
        System.out.println("Regular hours: " + emp.getRegularHours());
        System.out.println("Overtime hours: " + emp.getOvertimeHours());
        System.out.println("Total pay: $" + emp.getTotalPay());
    }
}
