package helicopter;

public class Quadcopter extends Helicopter {

    //Private variable declared because no other class needs access to this variable
    private int maxFlyingSpeed;

    //Parameterized constructor
    public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    //Default constructor with default values set
    public Quadcopter() {

        //Super keyword is used to access the variables from the parent class
        super("helicopter.Quadcopter",0.0, 0,0,0,0);
        this.maxFlyingSpeed = 0;
    }

    //Copy constructor
    public Quadcopter(Quadcopter other) {
        super(other);
        this.maxFlyingSpeed = other.maxFlyingSpeed;

    }

    //Getter and setter methods are declared
    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    //Equals method is overridden from the default one
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //Checks if same memory/reference
        if (obj == null || getClass() != obj.getClass()) return false; //Checks if it's the same class
        if (!super.equals(obj)) return false; //Uses the super to call the equals method from the parent class
        Quadcopter that = (Quadcopter) obj; //Casts the passed object into a Quadcopter type
        return getMaxFlyingSpeed() == that.maxFlyingSpeed; //Checks if the max flying speed of the passed object is the same
    }

    //ToString method prints the information
    @Override
    public String toString() {
        return super.toString() + " Its max flying speed is: " + maxFlyingSpeed + ".";
    }


}
