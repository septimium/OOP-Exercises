package hw1;

import java.util.*;

public class University {
    private String name;
    private String location;
    private List<Author> authors = new ArrayList<>();

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addAuthor(Author a){
        this.authors.add(a);
        a.setUniv(this);
    }

    public double computeScore(){
        double sum = 0;
        for(Author a: authors){
            sum = sum + a.computeScore();
        }
        return sum;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public static void main(String args[]){ // testing
        University u = new University("Upb", "Bucharest");
        Author a1 = new Author("Andrei");
        Publication p1 = new ConferenceProceeding("Pub1", new GregorianCalendar(2019,8,22), 3, "ionel", true);
        Publication p2 = new ConferenceProceeding("Pub2", new GregorianCalendar(2020,9,25), 1, "bonel", false);
        Publication p3 = new Journal("Pub3", new GregorianCalendar(2015,2,11), 2, "ionelus", 5);
        Publication p4 = new Journal("Pub4", new GregorianCalendar(2022,3,2), 6, "bonelus", 2);
        a1.addPublication(p1);
        a1.addPublication(p2);
        a1.addPublication(p3);
        a1.addPublication(p4);
        u.addAuthor(a1);
        Author a2 = new Author("Mihai");
        Publication pp1 = new ConferenceProceeding("Pubb1", new GregorianCalendar(2019,8,22), 2, "conel", false);
        Publication pp2 = new Journal("Pubb2", new GregorianCalendar(2014,5,22), 1, "conelus", 2.5);
        Publication pp3 = new ConferenceProceeding("Pubb3", new GregorianCalendar(2012,4,21), 5, "donel", true);
        Publication pp4 = new Journal("Pubb4", new GregorianCalendar(2021,4,12), 7, "donelus", 4.55);
        a2.addPublication(pp1);
        a2.addPublication(pp2);
        u.addAuthor(a2);
        System.out.println("Score of Author "+a1.getName()+" is "+a1.computeScore());
        System.out.println("Score of Author "+a2.getName()+" is "+a2.computeScore());
        System.out.println("Score of University "+u.getName()+" is "+u.computeScore());
        System.out.println(a2.getUniv().getName());
    }
}
