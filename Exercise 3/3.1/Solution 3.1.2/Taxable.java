package hw312;

public interface Taxable {
    public double computeVAT();
    public double computeRoadTax();
    public double computeCustomTax();
    public double computeTotalTax();
}
