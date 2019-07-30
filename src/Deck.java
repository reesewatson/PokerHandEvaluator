import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    Deck() {
        cards = new ArrayList<Card>();
        int index1, index2;
        Random generator = new Random();
        Card temp;
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 13; b++) {
                 cards.add(new Card(a, b));
            }
        }
        int size;
        for (int i = 0; i < 100; i++) {
            index1 = generator.nextInt(cards.size()-1);
            index2 = generator.nextInt(cards.size()-1);
            temp = cards.get(index2);
            cards.set(index2, cards.get(index1));
            cards.set(index1, temp);
        }
    }

    public Card drawFromDeck() {
        return cards.remove(0);
    }

    public int getTotalCards() {
        return cards.size();
    }
}
