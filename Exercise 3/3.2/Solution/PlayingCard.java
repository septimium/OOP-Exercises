package hw3_2;

public class PlayingCard {

    private Rank r;
    private Suit s;

    public PlayingCard(Rank r, Suit s) {
        this.r = r;
        this.s = s;
    }

    public Rank getR() {
        return r;
    }

    public void setR(Rank r) {
        this.r = r;
    }

    public Suit getS() {
        return s;
    }

    public void setS(Suit s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Card{" +
                "r=" + r +
                ", s=" + s +
                '}';
    }

    public enum Rank{
        TWO (2, "Two"),
        THREE (3, "Three"),
        FOUR (4, "Four"),
        FIVE (5, "Five"),
        SIX(6, "Six"),
        SEVEN (7, "Seven"),
        EIGHT (8, "Eight"),
        NINE (9, "Nine"),
        TEN (10, "Ten"),
        KNIGHT(11, "Knight"),
        QUEEN (12, "Queen"),
        KING (13, "King"),
        ACE (14, "Ace");
        private final int value;
        private final String text;

        Rank(int value, String text){
            this.value = value;
            this.text = text;
        }

        public int getValue() {
            return value;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "Rank{" +
                    "value=" + value +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    public enum Suit{

        CLUBS (1, "Clubs"),
        DIAMONDS (2, "Diamonds"),
        HEARTS (3, "Hearts"),
        SPADES (4, "Spades");
        private final int value;
        private final String text;

        Suit(int value, String text){
            this.value = value;
            this.text = text;
        }

        public int getValue() {
            return value;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "Suit{" +
                    "value=" + value +
                    ", text='" + text + '\'' +
                    '}';
        }
    }


}
