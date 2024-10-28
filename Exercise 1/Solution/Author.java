package hw1;

import java.util.*;

public class Author {
    private String name;
    private List<Publication> publications = new ArrayList<>();
    private University univ;

    public Author(String name) {
        this.name = name;
    }

    public void addPublication(Publication p){
        this.publications.add(p);
    }

    public double computeScore(){
        double sum = 0;
        for(Publication p: publications){
            sum = sum + p.computeScore();
        }
        return sum;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public University getUniv() {
        return univ;
    }

    public void setUniv(University univ) {
        this.univ = univ;
    }
}
