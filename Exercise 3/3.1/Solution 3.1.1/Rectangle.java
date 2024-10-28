package hw311;

public class Rectangle extends GeometricalForm{

    private int width;
    private int height;

    public Rectangle(int xCoord, int yCoord, int width, int height) {
        super(xCoord, yCoord);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void shrink() {
        this.width /= 2;
        this.height /= 2;
        System.out.println("Shrinked!");
    }

    @Override
    public void enlarge() {
        this.width *= 2;
        this.height *= 2;
        System.out.println("Enlarged!");
    }
}
