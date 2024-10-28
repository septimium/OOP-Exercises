package hw312;

public class Bus extends Vehicle{
    public Bus(double basePrice, String name, String country) {
        super(basePrice, name, country);
    }
    @Override
    public double computeRoadTax() {
        return this.getBasePrice()*0.04;
    }

    @Override
    public String toString() {
        return "Bus" + super.toString();
    }
}
