package hw311;

public class Elipse extends GeometricalForm{

    private int hRadius;
    private int vRadius;

    public Elipse(int xCoord, int yCoord, int hRadius, int vRadius) {
        super(xCoord, yCoord);
        this.hRadius = hRadius;
        this.vRadius = vRadius;
    }

    public int gethRadius() {
        return hRadius;
    }

    public int getvRadius() {
        return vRadius;
    }

    @Override
    public void shrink() {
        this.hRadius /= 2;
        this.vRadius /= 2;
        System.out.println("Shrinked!");
    }

    @Override
    public void enlarge() {
        this.hRadius *= 2;
        this.vRadius *= 2;
        System.out.println("Enlarged!");
    }
}
