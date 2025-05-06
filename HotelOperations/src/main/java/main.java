public class main {
    public static void main(String[] args) {

        Room room1 = new Room(2, 100.0);
        System.out.println("Room available: " + room1.isAvailable());
        room1.checkIn();
        System.out.println("Room available after check-in: " + room1.isAvailable());
        room1.cleanRoom();
        room1.checkOut();
        System.out.println("Room available after check-out: " + room1.isAvailable());

        Employee emp = new Employee("E007", "Andrew", "Front Desk", 20.0);
        emp.punchTimeCard(9.0);  // Punch in at 9:00
        emp.punchTimeCard(17.0); // Punch out at 17:00
        System.out.println("Employee: " + emp.getName());
        System.out.println("Regular hours: " + emp.getRegularHours());
        System.out.println("Overtime hours: " + emp.getOvertimeHours());
        System.out.println("Total pay: $" + emp.getTotalPay());

        Reservation res = new Reservation("king", 3, true);
        System.out.println("Reservation total price: $" + res.getReservationTotal());
    }
}
