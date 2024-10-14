package mav;

import uav.UAV;

public class MAV extends UAV {

    //Variables are private because no other class needs access to these variables
    private String model;
    private double size;

    //Parameterized constructor
    public MAV(String model,double size, double weight, double price){
        super(weight, price);
        this.model = model;
        this.size = size;

    }

    //Default constructor
    public MAV(){
       super(0.0,0.0);
        this.model = "";
        this.size = 0.0;
    }

    //Copy constructor
    public MAV(MAV other){
        super(other);
        this.model = other.model;
        this.size = other.size;
    }

    //Getter and setter methods
    public double getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //Overridden equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        MAV mav = (MAV) obj;
        return Double.compare(getSize(), mav.getSize()) == 0 && this.getModel().equals(mav.getModel());
    }

    //toString method to display relevant information
    @Override
    public String toString() {
        return "The model of this MAV is manufactured by " + model + " and is " + size + " cm tall." + super.toString();
    }
}
