package Lesson9.fantan;

import Lesson9.trump.Card;
import Lesson9.trump.Table;

public class FantanTable implements Table {
    private Card[][] table_ = new Card[Card.SUIT_NUM][Card.CARD_NUM];

    public void putCard(Card[] card) {
        int number = card[0].getNumber();
        int suit = card[0].getSuit();

        table_[suit - 1][number - 1] = card[0];
    }

    public Card[][] getCards() {
        Card[][] table = new Card[Card.SUIT_NUM][Card.CARD_NUM];
        for (int suit = 0; suit < Card.SUIT_NUM; suit++) {
            System.arraycopy(table_[suit], 0, table[suit], 0, Card.CARD_NUM);
        }

        return table;
    }

    public String toString() {
        StringBuffer tableString = new StringBuffer(200);
        for (int suit = 0; suit < Card.SUIT_NUM; suit++) {
            for (int number = 0; number < Card.CARD_NUM; number++) {
                if (table_[suit][number] != null) {
                    tableString.append(table_[suit][number]);
                } else {
                    tableString.append("..");
                }

                tableString.append(" ");
            }

            tableString.append("\n");
        }

        return tableString.toString();
    }
}
