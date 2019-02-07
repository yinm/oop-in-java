package Lesson8;

import java.util.ArrayList;

public class Hand {
    private ArrayList hand_ = new ArrayList();

    public void addCard(Card card) {
        hand_.add(card);
    }

    public Card lookCard(int position) {
        Card lookingCard = null;

        if ((0 <= position) && (position < hand_.size())) {
            lookingCard = (Card)hand_.get(position);
        }

        return lookingCard;
    }

    public Card pickCard(int position) {
        Card pickedCard = null;

        if ((0 <= position) && (position < hand_.size())) {
            pickedCard = (Card)hand_.remove(position);
        }

        return pickedCard;
    }

    public void shuffle() {
        int number = hand_.size();

        int pos;

        for (int count = 0; count < number * 2; count++) {
            pos = (int)(Math.random() * number);
            Card pickedCard = (Card)hand_.remove(pos);

            hand_.add(pickedCard);
        }
    }

    public int getNumberOfCards() {
        return hand_.size();
    }

    public String toString() {
        StringBuffer string = new StringBuffer();

        int size = hand_.size();
        if (size > 0) {
            for (int index = 0; index < size; index++) {
                Card card = (Card)hand_.get(index);
                string.append(card);
                string.append(" ");
            }
        }

        return string.toString();
    }
}
