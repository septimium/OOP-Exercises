package hw3_2;
import java.io.FileNotFoundException;

public class WarGame {

    public static void main (String[]args) throws FileNotFoundException
    {
        Deck deck = new Deck();
        Deck player1 = new Deck();
        Deck player2 = new Deck();
        Deck player3 = new Deck();
        Deck player4 = new Deck();

        int nog = 10; // number of games
        int max = 1; // initial max number of rounds
        int min = 100; // initial min number of rounds

        for(int i = 0; i<nog; i++){
            //Adding the cards
            System.out.println("Adding all cards.");
            {
                deck.addCard(new PlayingCard(PlayingCard.Rank.ACE, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.ACE, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.ACE, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.ACE, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.TWO, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.TWO, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.TWO, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.TWO, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.THREE, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.THREE, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.THREE, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.THREE, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.FOUR, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.FOUR, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.FOUR, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.FOUR, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.FIVE, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.FIVE, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.FIVE, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.FIVE, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.SIX, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.SIX, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.SIX, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.SIX, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.SEVEN, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.SEVEN, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.SEVEN, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.SEVEN, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.EIGHT, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.EIGHT, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.EIGHT, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.EIGHT, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.NINE, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.NINE, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.NINE, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.NINE, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.TEN, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.TEN, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.TEN, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.TEN, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.KNIGHT, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.KNIGHT, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.KNIGHT, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.KNIGHT, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.QUEEN, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.QUEEN, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.QUEEN, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.QUEEN, PlayingCard.Suit.CLUBS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.KING, PlayingCard.Suit.HEARTS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.KING, PlayingCard.Suit.SPADES));
                deck.addCard(new PlayingCard(PlayingCard.Rank.KING, PlayingCard.Suit.DIAMONDS));
                deck.addCard(new PlayingCard(PlayingCard.Rank.KING, PlayingCard.Suit.CLUBS));
            }
            deck.shuffle();
            // Giving every player 13 cards
            for(int j = 0; j<13; j++){
                player1.addCard(deck.getCards().getFirst());
                deck.removeCard(deck.getCards().getFirst().getR(), deck.getCards().getFirst().getS());
            }
            for(int k = 0; k<13; k++){
                player2.addCard(deck.getCards().getFirst());
                deck.removeCard(deck.getCards().getFirst().getR(), deck.getCards().getFirst().getS());
            }
            for(int l = 0; l<13; l++){
                player3.addCard(deck.getCards().getFirst());
                deck.removeCard(deck.getCards().getFirst().getR(), deck.getCards().getFirst().getS());
            }
            for(int m = 0; m<13; m++){
                player4.addCard(deck.getCards().getFirst());
                deck.removeCard(deck.getCards().getFirst().getR(), deck.getCards().getFirst().getS());
            }
            // War game
            boolean finished = false;
            int q = 0; // number of rounds
            while(!finished) {
                // When a player has no more cards
                if (player1.getCards().isEmpty() || player2.getCards().isEmpty() ||
                        player3.getCards().isEmpty() || player4.getCards().isEmpty()) {
                    finished = true;
                    System.out.println("Game over! One of the players has no more cards!");
                    System.out.println();
                }
                else {
                    q++;
                    System.out.println("GAME #"+i+". ROUND NUMBER #" + q);
                    // Checking every case (can be done easier probably)
                    if (player1.getCards().getFirst().getR().getValue() > player2.getCards().getFirst().getR().getValue()
                            && player1.getCards().getFirst().getR().getValue() > player3.getCards().getFirst().getR().getValue()
                            && player1.getCards().getFirst().getR().getValue() > player4.getCards().getFirst().getR().getValue()) {
                        System.out.println("Player 1 won the round!");
                        PlayingCard temp = player1.getCards().getFirst();
                        player1.addCard(player2.getCards().getFirst());
                        player1.addCard(player3.getCards().getFirst());
                        player1.addCard(player4.getCards().getFirst());
                        player1.removeCard(player1.getCards().getFirst().getR(), player1.getCards().getFirst().getS());
                        player3.removeCard(player3.getCards().getFirst().getR(), player3.getCards().getFirst().getS());
                        player2.removeCard(player2.getCards().getFirst().getR(), player2.getCards().getFirst().getS());
                        player4.removeCard(player4.getCards().getFirst().getR(), player4.getCards().getFirst().getS());
                        player1.addCard(temp);
                    }
                    else if (player2.getCards().getFirst().getR().getValue() > player1.getCards().getFirst().getR().getValue()
                            && player2.getCards().getFirst().getR().getValue() > player3.getCards().getFirst().getR().getValue()
                            && player2.getCards().getFirst().getR().getValue() > player4.getCards().getFirst().getR().getValue()) {
                        System.out.println("Player 2 won the round!");
                        PlayingCard temp = player2.getCards().getFirst();
                        player2.addCard(player1.getCards().getFirst());
                        player2.addCard(player3.getCards().getFirst());
                        player2.addCard(player4.getCards().getFirst());
                        player1.removeCard(player1.getCards().getFirst().getR(), player1.getCards().getFirst().getS());
                        player3.removeCard(player3.getCards().getFirst().getR(), player3.getCards().getFirst().getS());
                        player2.removeCard(player2.getCards().getFirst().getR(), player2.getCards().getFirst().getS());
                        player4.removeCard(player4.getCards().getFirst().getR(), player4.getCards().getFirst().getS());
                        player2.addCard(temp);
                    }
                    else if (player3.getCards().getFirst().getR().getValue() > player2.getCards().getFirst().getR().getValue()
                            && player3.getCards().getFirst().getR().getValue() > player1.getCards().getFirst().getR().getValue()
                            && player3.getCards().getFirst().getR().getValue() > player4.getCards().getFirst().getR().getValue()) {
                        System.out.println("Player 3 won the round!");
                        PlayingCard temp = player3.getCards().getFirst();
                        player3.addCard(player2.getCards().getFirst());
                        player3.addCard(player1.getCards().getFirst());
                        player3.addCard(player4.getCards().getFirst());
                        player1.removeCard(player1.getCards().getFirst().getR(), player1.getCards().getFirst().getS());
                        player3.removeCard(player3.getCards().getFirst().getR(), player3.getCards().getFirst().getS());
                        player2.removeCard(player2.getCards().getFirst().getR(), player2.getCards().getFirst().getS());
                        player4.removeCard(player4.getCards().getFirst().getR(), player4.getCards().getFirst().getS());
                        player3.addCard(temp);
                    }
                    else if (player4.getCards().getFirst().getR().getValue() > player2.getCards().getFirst().getR().getValue()
                            && player4.getCards().getFirst().getR().getValue() > player3.getCards().getFirst().getR().getValue()
                            && player4.getCards().getFirst().getR().getValue() > player1.getCards().getFirst().getR().getValue()) {
                        System.out.println("Player 4 won the round!");
                        PlayingCard temp = player4.getCards().getFirst();
                        player4.addCard(player2.getCards().getFirst());
                        player4.addCard(player3.getCards().getFirst());
                        player4.addCard(player4.getCards().getFirst());
                        player1.removeCard(player1.getCards().getFirst().getR(), player1.getCards().getFirst().getS());
                        player3.removeCard(player3.getCards().getFirst().getR(), player3.getCards().getFirst().getS());
                        player2.removeCard(player2.getCards().getFirst().getR(), player2.getCards().getFirst().getS());
                        player4.removeCard(player4.getCards().getFirst().getR(), player4.getCards().getFirst().getS());
                        player4.addCard(temp);
                    }
                    // If any 2 players have the same number the round ends and every player has a card removed
                    else if (player1.getCards().getFirst().getR().getValue() == player2.getCards().getFirst().getR().getValue()
                            || player1.getCards().getFirst().getR().getValue() == player3.getCards().getFirst().getR().getValue()
                            || player1.getCards().getFirst().getR().getValue() == player4.getCards().getFirst().getR().getValue()
                            || player2.getCards().getFirst().getR().getValue() == player3.getCards().getFirst().getR().getValue()
                            || player2.getCards().getFirst().getR().getValue() == player4.getCards().getFirst().getR().getValue()
                            || player3.getCards().getFirst().getR().getValue() == player4.getCards().getFirst().getR().getValue()) {
                        System.out.println("Round draw!");
                        player1.removeCard(player1.getCards().getFirst().getR(), player1.getCards().getFirst().getS());
                        player3.removeCard(player3.getCards().getFirst().getR(), player3.getCards().getFirst().getS());
                        player2.removeCard(player2.getCards().getFirst().getR(), player2.getCards().getFirst().getS());
                        player4.removeCard(player4.getCards().getFirst().getR(), player4.getCards().getFirst().getS());
                    }
                }
            }
            if(q > max)
                max = q;
            if(q < min)
                min = q;

        }

        int mean = (min+max)/2;
        System.out.println();
        System.out.println("After "+nog+" games the minimum number of rounds is "+min+" and the maximum number of rounds is "+
                max+". The average number of rounds is "+mean);
    }
}
