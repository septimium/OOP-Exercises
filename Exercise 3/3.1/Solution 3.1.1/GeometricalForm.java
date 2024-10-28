package hw311;

import java.util.ArrayList;
import java.util.List;

public class GeometricalForm implements FormOperations{
    private int xCoord;
    private int yCoord;
    private String iColor;
    private String fColor;

    public GeometricalForm(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public String getiColor() {
        if(this.iColor!=null)
            return iColor;
        else
            return "Doesn't have a color.";
    }

    public String getfColor() {
        if(this.fColor!=null)
            return fColor;
        else
            return "Doesn't have a color.";
    }

    @Override
    public void move(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    @Override
    public void shrink() {
        System.out.println("You can't shrink this geometrical form.");
    }

    @Override
    public void enlarge() {
        System.out.println("You can't enlarge this geometrical form.");
    }

    @Override
    public void changeFormColor(String color) {
        this.fColor = color;
    }

    @Override
    public void changeInnerColor(String color) {
        this.iColor = color;
    }

    public static void main(String args[]){
        List<GeometricalForm> forms = new ArrayList<>();
        GeometricalForm f1 = new GeometricalForm(3, 4);
        Rectangle f2 = new Rectangle(5, 7, 4, 9);
        Elipse f3 = new Elipse(3, 3, 5, 4);
        forms.add(f1);
        forms.add(f2);
        forms.add(f3);
        System.out.println("Coords: ");
        for(GeometricalForm a : forms){
            System.out.println("X coord:" +a.getxCoord());
            System.out.println("Y coord:" +a.getyCoord());
            System.out.println();
        }
        f1.move(12, 9);
        f2.move(17, 12);
        f3.move(9, 5);
        System.out.println("Coords after moving: ");
        for(GeometricalForm a : forms){
            System.out.println("X coord:" +a.getxCoord());
            System.out.println("Y coord:" +a.getyCoord());
            System.out.println();
        }
        forms.get(0).changeFormColor("blue");
        forms.get(0).changeInnerColor("yellow");
        System.out.println("Colors: ");
        for(GeometricalForm a : forms){
            System.out.println("Inner:" +a.getiColor());
            System.out.println("Form:" +a.getfColor());
            System.out.println();
        }
        System.out.println("Rectangle: ");
        System.out.println(f2.getWidth());
        System.out.println(f2.getHeight());
        System.out.println();
        System.out.println("Elipse: ");
        System.out.println(f3.gethRadius());
        System.out.println(f3.getvRadius());
        System.out.println();
        f1.enlarge();
        f2.enlarge();
        f3.shrink();
        System.out.println();
        System.out.println("Rectangle: ");
        System.out.println(f2.getWidth());
        System.out.println(f2.getHeight());
        System.out.println();
        System.out.println("Elipse: ");
        System.out.println(f3.gethRadius());
        System.out.println(f3.getvRadius());

    }
}
