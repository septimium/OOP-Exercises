package hw1;

import java.util.*;
public abstract class Publication {
    private String name;
    private GregorianCalendar apparition;
    private int numberOfAuthors;

    public Publication(String name, GregorianCalendar apparition, int numberOfAuthors) {
        this.name = name;
        this.apparition = apparition;
        this.numberOfAuthors = numberOfAuthors;
    }

    public abstract double computeScore();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getApparition() {
        return apparition;
    }

    public void setApparition(GregorianCalendar apparition) {
        this.apparition = apparition;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }
}