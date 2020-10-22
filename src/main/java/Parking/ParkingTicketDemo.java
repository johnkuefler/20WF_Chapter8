/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parking;

/**
 *
 * @author johnk
 */
public class ParkingTicketDemo {

    public static void main(String[] args) {

        ParkedCar myCar = new ParkedCar("Subaru", "Forester", "Blue", "ASA123", 68);

        ParkingMeter meter = new ParkingMeter(60);

        PoliceOfficer officer = new PoliceOfficer("Bob Tester", "1234");

        ParkingTicket ticket = officer.checkMeter(myCar, meter);

        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No ticket!");
        }

    }
}
