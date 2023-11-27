package hw312;

public class Truck extends Vehicle{
    public Truck(double basePrice, String name, String country) {
        super(basePrice, name, country);
    }

    @Override
    public double computeRoadTax() {
        return this.getBasePrice()*0.05;
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }
}
