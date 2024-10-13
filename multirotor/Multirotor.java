package multirotor;

import helicopter.Helicopter;

public class Multirotor extends Helicopter {
    private int numberOfRotors;

    //Parameterized constructor
    public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int numberOfRotors){

        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.numberOfRotors = numberOfRotors;

    }

    //Default constructor
    public Multirotor() {
        super("multirotor.Multirotor", 0.0, 0, 0,0,0);
        this.numberOfRotors = 0;
    }

    //Copy constructor
    public Multirotor(Multirotor other){
        super(other);
        this.numberOfRotors = other.numberOfRotors;

    }

    //Getter and setter methods are declared
    public int getNumberOfRotors() {
        return numberOfRotors;
    }

    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    //Overridden equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Multirotor that = (Multirotor) obj;
        return getNumberOfRotors() == that.numberOfRotors;
    }


    //ToString method declared to display relevant information
    @Override
    public String toString(){
        return super.toString() + " It has " + numberOfRotors + " rotors.";
    }
}
