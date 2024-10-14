package uav;

public class UAV  {

    //Protected variables because subclasses needs access to these variables
    protected double weight;
    protected double price;

    //Parameterized constructor
    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;

    }

    //Default constructor
    public UAV(){
        this.weight = 0;
        this.price = 0;
    }

    //Copy constructor
    public UAV(UAV other){
        this.weight = other.weight;
        this.price = other.price;
    }

    //Getter and setter methods
    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Overridden equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UAV uav = (UAV) obj;
        return Double.compare(getWeight(), uav.weight) == 0 && Double.compare(getPrice(), uav.price) == 0;
    }

    //toString method to display relevant information
    @Override
    public String toString() {
        return "This UAV type aircraft weighs " + weight + " kg and costs " + price +"$.";
    }

}
