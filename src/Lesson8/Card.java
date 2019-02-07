package Lesson8;

public class Card {
    public static final int SUIT_SPADE = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_CLUB = 3;
    public static final int SUIT_HEART = 4;
    public static final int SUIT_NUM = 4;
    public static final int CARD_NUM = 13;

    protected int suit_;
    protected int number_;

    public Card(int suit, int number) {
        this.suit_ = suit;
        this.number_ = number;
    }

    public int getNumber() {
        return number_;
    }

    public int getSuit() {
        return suit_;
    }

    public String toString() {
        StringBuffer string = new StringBuffer();

        switch (suit_) {
            case SUIT_SPADE:
                string.append("S");
                break;

            case SUIT_DIAMOND:
                string.append("D");
                break;

            case SUIT_CLUB:
                string.append("C");
                break;

            case SUIT_HEART:
                string.append("H");
                break;

            default:
                break;
        }

        switch (number_) {
            case 1:
                string.append("A");
                break;

            case 10:
                string.append("T");
                break;

            case 11:
                string.append("J");
                break;

            case 12:
                string.append("Q");
                break;

            case 13:
                string.append("K");
                break;

            default:
                string.append(number_);
                break;
        }

        return string.toString();
    }
}
