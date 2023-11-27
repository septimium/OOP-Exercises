package hw3_2;
import java.util.*;
import java.io.*;

public class Deck{
    private List<PlayingCard> cards = new ArrayList<>();

    public void addCard(PlayingCard c){
        this.cards.add(c);
    }

    public boolean removeCard(PlayingCard.Rank r, PlayingCard.Suit s){
        boolean found = false;
        PlayingCard temp = null;
        for(PlayingCard c : cards){
            if(c.getR().getText().equalsIgnoreCase(r.getText()) && c.getS().getValue() == s.getValue()){
                found = true;
                temp = c;
            }
        }
        if(temp!=null) cards.remove(temp);
        return found;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void sort(){
        Collections.sort(cards, new Comparator<PlayingCard>() {
            @Override
            public int compare(PlayingCard o1, PlayingCard o2) {
                return o1.getS().getValue() - o2.getS().getValue();
            }
        });

        Collections.sort(cards, new Comparator<PlayingCard>() {
            @Override
            public int compare(PlayingCard o1, PlayingCard o2) {
                return o1.getR().compareTo(o2.getR());
            }
        });

        Collections.sort(cards, new Comparator<PlayingCard>() {
            @Override
            public int compare(PlayingCard o1, PlayingCard o2) {
                if(o1.getR() == o2.getR() && o1.getS() == o2.getS()){
                    throw new RuntimeException("There are two cards of type "+o2.getR()+" of "+ o2.getS()+". Someone is cheating.");
                }
                return o1.getS().compareTo(o2.getS());
            }
        });
    }

    public void display(){
        for(PlayingCard c : cards){
            System.out.println(c.toString());
        }
    }

    public List<PlayingCard> getCards() {
        return cards;
    }
}
