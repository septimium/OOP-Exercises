package hw1;

import java.util.GregorianCalendar;

public class ConferenceProceeding extends Publication {
    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String name, GregorianCalendar apparition, int numberOfAuthors, String volumeName, boolean indexed) {
        super(name, apparition, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }

    @Override
    public double computeScore() {
        if(this.isIndexed()){
            return 0.25/this.getNumberOfAuthors();
        }
        else{
            return 0.2/this.getNumberOfAuthors();
        }
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public boolean isIndexed() {
        return indexed;
    }

    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }
}
