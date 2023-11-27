package hw312;

public class Minibus extends Vehicle{
    public Minibus(double basePrice, String name, String country) {
        super(basePrice, name, country);
    }

    @Override
    public double computeRoadTax() {
        return this.getBasePrice()*0.03;
    }
    @Override
    public String toString() {
        return "Minibus" + super.toString();
    }
}
