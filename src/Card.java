public class Card {

    private short rank, suit;
    private static String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    protected static String rankAsString(int rank) {
        return ranks[rank];
    }

    Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public @Override String toString(){
        return ranks[rank] + " of " + suits[suit];
    }

    public short getRank() {
        return rank;
    }

    public short getSuit() {
        return suit;
    }
}
