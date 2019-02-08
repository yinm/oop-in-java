package Lesson9.fantan;

import Lesson9.trump.*;

public class FantanPlayer extends Player {
    private int pass_;

    public FantanPlayer(String name, Master master, Table table, Rule rule) {
        super(name, master, table, rule);
    }

    public void receivedCard(Card card) {
        if (card.getNumber() == 7) {
            System.out.println(name_ + ":" + card + "を置きました。");
            table_.putCard(new Card[] { card });
        } else {
            super.receivedCard(card);
        }
    }

    public void play(Player nextPlayer) {
        System.out.println("  " + myHand_);
        Card[] candidate = rule_.findCandidate(myHand_, table_);

        if (candidate != null) {
            System.out.println("  " + candidate[0] + "を置きました。\n");
            table_.putCard(candidate);

            System.out.println(table_);

            if (myHand_.getNumberOfCards() == 0) {
                master_.declareWin(this);
            }
        } else {
            pass_++;
            ((FantanMaster)master_).pass(this);

            if (pass_ > FantanMaster.PASS_LIMIT) {
                int numberOfHand = myHand_.getNumberOfCards();
                for (int count = 0; count < numberOfHand; count++) {
                    table_.putCard(new Card[] { myHand_.pickCard(0) });
                }
            }
        }
    }

    public int getPass() {
        return pass_;
    }
}
