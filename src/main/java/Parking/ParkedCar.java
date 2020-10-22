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
public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int numberOfMinutesParked;

    public ParkedCar() {
        
    }
    
    public ParkedCar(String make, String model, String color, String licenseNumber, int numberOfMinutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.numberOfMinutesParked = numberOfMinutesParked;
    }

    public ParkedCar(ParkedCar car2) {
        this.make = car2.make;
        this.model = car2.model;
        this.color = car2.color;
        this.licenseNumber = car2.licenseNumber;
        this.numberOfMinutesParked = car2.numberOfMinutesParked;
    }
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getNumberOfMinutesParked() {
        return numberOfMinutesParked;
    }

    public void setNumberOfMinutesParked(int numberOfMinutesParked) {
        this.numberOfMinutesParked = numberOfMinutesParked;
    }

    @Override
    public String toString() {
        return "ParkedCar{" + "make=" + make + ", model=" + model + ", color=" + color + ", licenseNumber=" + licenseNumber + ", numberOfMinutesParked=" + numberOfMinutesParked + '}';
    }
    
}
