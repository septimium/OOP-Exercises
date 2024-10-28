package hw2;

public class Share {
    private double value;
    private Company comp;

    private Portfolio portfolio;

    public Share(double value, Company comp) {
        this.value = value;
        this.comp = comp;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Company getComp() {
        return comp;
    }

    public void setComp(Company comp) {
        this.comp = comp;
    }
}