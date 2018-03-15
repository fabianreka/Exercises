package exercise3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class Deck {
    private int cardNum;
    private List<Card> cardList;
    private String[] colors = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};

    public Deck(int cardNum) {
        this.cardNum = cardNum;
        cardList = new LinkedList<Card>();
        int vLength = values.length;
        int c = 0;
        int rnd;
        for (int i = 0; i < cardNum; i = i + 1) {
            rnd = (int) (Math.random() * vLength);
            Card temp = new Card(colors[c], values[rnd]);
            while (cardList.contains(temp)) {
                rnd = (int) (Math.random() * vLength);
                temp = new Card(colors[c], values[rnd]);
            }
            cardList.add(temp);
            c = c + 1;
            if (c > 3) {
                c = 0;
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cardList);
    }

    public Card draw() {
        Card drawn = cardList.get(0);
        cardList.remove(drawn);
        cardNum = cardNum - 1;
        return drawn;
    }

    @Override
    public String toString() {
        int h = 0;
        int d = 0;
        int c = 0;
        int s = 0;
        for (Card card : cardList) {
            switch (card.getColor()) {
                case "Hearts":
                    h = h + 1;
                    break;
                case "Diamonds":
                    d = d + 1;
                    break;
                case "Clubs":
                    c = c + 1;
                    break;
                case "Spades":
                    s = s + 1;
                    break;
            }
        }

        return cardNum + " Cards - " + h + " Hearts, " + d + " Diamonds, " + c + " Clubs, " + s + " Spades";
    }
}
