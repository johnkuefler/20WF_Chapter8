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
public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

      public PoliceOfficer(PoliceOfficer o) {
        this.name = o.name;
        this.badgeNumber = o.badgeNumber;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    @Override
    public String toString() {
        return "PoliceOfficer{" + "name=" + name + ", badgeNumber=" + badgeNumber + '}';
    }
    
    public ParkingTicket checkMeter(ParkedCar car, ParkingMeter meter) {
        ParkingTicket ticket = null;
        
        int illegalMinutes = car.getNumberOfMinutesParked() - 
                             meter.getMinutesPurchased();
        
        if (illegalMinutes > 0) {
            ticket = new ParkingTicket(car, this, illegalMinutes);
        }
        
        return ticket;
    }
}
