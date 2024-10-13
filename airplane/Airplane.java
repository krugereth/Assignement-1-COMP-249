package airplane;

public class Airplane{

    //Protected variables declared, so it can be accessed by its subclasses and classes in the same package only
    protected String brand;
    protected double price;
    protected int horsepower;

    //Parameterized constructor
    public Airplane(String brand, double price, int horsepower){
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    //Default constructor with default values
    public Airplane() {
        this.brand = "";
        this.price = 0;
        this.horsepower = 0;
    }

    //Copy constructor later used for the copy array method declared in Driver
    public Airplane(Airplane other) {
        this.brand = other.brand;
        this.price = other.price;
        this.horsepower = other.horsepower;
    }

    //Getter and setter methods are declared
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Equals method is overridden from the default one
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //checks if same memory
        if (obj == null || getClass() != obj.getClass()) return false; //checks if same class
        Airplane airplane = (Airplane) obj; //casts the passed object into airplane object
        return Double.compare(getPrice(), airplane.getPrice()) == 0 && //checks if the price, horsepower and brand name matches and returns true or false
                getHorsepower() == airplane.getHorsepower() &&
                getBrand().equals(airplane.getBrand());
    }

    //ToString method to display the information
    @Override
    public String toString(){
        return "This aircraft is manufactured by: " + brand + ". It costs " + price + "$ and produces " + horsepower + " hp.";
    }

}