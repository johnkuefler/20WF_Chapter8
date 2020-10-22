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
public class ParkingMeter {
    private int minutesPurchased;

    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public ParkingMeter(ParkingMeter m) {
        this.minutesPurchased = m.minutesPurchased;
    }
    
    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    @Override
    public String toString() {
        return "ParkingMeter{" + "minutesPurchased=" + minutesPurchased + '}';
    }
}
