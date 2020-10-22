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
public class ParkingTicket {

    private PoliceOfficer officer;
    private ParkedCar car;
    private int minutes;
    private double fine;

    public final double BASE_FINE = 25.0;
    public final double HOURLY_FINE = 10.0;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int min) {
        this.car = new ParkedCar(car);
        this.officer = new PoliceOfficer(officer);
        this.minutes = min;
        
        this.calculateFine();
    }

    private void calculateFine() {
        double hours = this.minutes / 60;

        int hoursAsInt = (int) hours;

        if ((hours - hoursAsInt) > 0) {
            hoursAsInt++;
        }
        
        this.fine = BASE_FINE;
        this.fine += (hoursAsInt * HOURLY_FINE);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }

    public ParkedCar getCar() {
        return car;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "ParkingTicket{" + "officer=" + officer + ", car=" + car + ", minutes=" + minutes + ", fine=" + fine + '}';
    }
    
    
}
