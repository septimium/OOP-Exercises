package hw1;

import java.util.GregorianCalendar;

public class Journal extends Publication{
    private String journalName;
    private double impactFactor;

    public Journal(String name, GregorianCalendar apparition, int numberOfAuthors, String journalName, double impactFactor) {
        super(name, apparition, numberOfAuthors);
        this.journalName = journalName;
        this.impactFactor = impactFactor;
    }

    @Override
    public double computeScore() {
        return (this.impactFactor * 0.5) / this.getNumberOfAuthors();
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public double getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(double impactFactor) {
        this.impactFactor = impactFactor;
    }
}
