package mav;

import uav.UAV;

public class AgriculturalDrone extends UAV {

    //Private variables are declared because no other class need access to these variables
    private String brand;
    private int carryType;

    //Parameterized constructor
    public AgriculturalDrone(double weight, double price,String brand, int carryType){
        super(weight,price);
        this.brand = brand;
        this.carryType = carryType;
    }

    //Default constructor
    public AgriculturalDrone(){
        super(0.0,0.0);
        this.brand = "";
        this.carryType = 0;
    }

    //Copy constructor
    public AgriculturalDrone(AgriculturalDrone other){
        super(other);
        this.brand = other.brand;
        this.carryType = other.carryType;
    }

    //Getter and setter methods
    public String getBrand() {
        return brand;
    }

    public int getCarryType() {
        return carryType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarryType(int carryType) {
        this.carryType = carryType;
    }

    //Overridden equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        AgriculturalDrone that = (AgriculturalDrone) obj;
        return getCarryType() == that.carryType && this.getBrand().equals(that.getBrand());
    }

    //toString method to display relevant information
    @Override
    public String toString(){
        return "This agricultural drone is manufactured by " + brand + " and can carry up to " + carryType + " kg. " + super.toString();
    }

}
