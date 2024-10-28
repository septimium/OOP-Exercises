package hw312;

import java.util.*;
public abstract class Vehicle implements Taxable, Comparable<Vehicle> {
    private double basePrice;
    private String name;
    private String country;

    public Vehicle(double basePrice, String name, String country) {
        this.basePrice = basePrice;
        this.name = name;
        this.country = country;
    }

    @Override
    public double computeVAT(){
        return this.basePrice*0.19;
    }

    @Override
    public double computeCustomTax(){
        if(this.country.equalsIgnoreCase("romania")){
            return 0;
        }
        else
            return this.basePrice*0.1;
    }

    @Override
    public abstract double computeRoadTax();

    @Override
    public double computeTotalTax() {
        return this.computeRoadTax() + this.computeCustomTax() + this.computeVAT();
    }

    @Override
    public String toString() {
        return "{" +
                "basePrice=" + basePrice +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


    public int compareTo( Vehicle a ) {
        final int tax = Double.compare(this.computeTotalTax(), a.computeTotalTax());
        if(tax == 0){
            return Double.compare(this.getBasePrice(), a.getBasePrice());
        }
        else
            return tax;
    }
    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public static void main(String args[]){
        Vehicle v1 = new Bus(3000, "VW", "Romania");
        Vehicle v2 = new Truck(5200, "Volvo", "Hungary");
        Vehicle v3 = new Minibus(2500, "Daewoo", "China");
        System.out.println(v1.toString() + " and the total sum of taxes: "+v1.computeTotalTax());
        System.out.println(v2.toString() + " and the total sum of taxes: "+v2.computeTotalTax());
        System.out.println(v3.toString() + " and the total sum of taxes: "+v3.computeTotalTax());
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);
        Collections.sort(vehicles);
        System.out.println();
        System.out.println("Vehicles sorted:");
        for(Vehicle a : vehicles){
            System.out.println(a.toString() + " and the total sum of taxes: "+a.computeTotalTax());
        }
    }
}

