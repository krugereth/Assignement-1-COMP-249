package helicopter;

import airplane.Airplane;

public class Helicopter extends Airplane {

    //Protected variables are declared so it can be accessed by its subclasses and classes in the same package
    protected int numberOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;

    //Parameterized constructor
    public Helicopter(String brand,double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity) {

        super(brand, price, horsepower);
        this.numberOfCylinders = numberOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;

    }

    //Default constructor
    public Helicopter() {
        super("helicopter.Helicopter",0,0);
        this.numberOfCylinders = 0;
        this.creationYear = 0;
        this.passengerCapacity = 0;
    }

    //Copy constructor
    public Helicopter(Helicopter other) {
        super(other);
        this.numberOfCylinders = other.numberOfCylinders;
        this.creationYear = other.creationYear;
        this.passengerCapacity = other.passengerCapacity;

    }

    //Getter and setter methods are declared
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }



    //Overridden equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Helicopter that = (Helicopter) obj;
        return getNumberOfCylinders() == that.getNumberOfCylinders() && getCreationYear() == that.getCreationYear() && getPassengerCapacity() == that.getPassengerCapacity();
    }

    //ToString method to display relevant information
    @Override
    public String toString(){
        return super.toString() + " It has " + numberOfCylinders +" cylinders and was created in " + creationYear + ". It can also carry up to " + passengerCapacity + " passengers.";
    }

}
