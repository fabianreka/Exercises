package exercise3;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(15);
        System.out.println(deck);
        deck.shuffle();
        Card card = deck.draw();
        System.out.println(card);
        System.out.println(deck);
    }
}
