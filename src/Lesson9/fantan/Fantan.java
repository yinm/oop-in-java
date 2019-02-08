package Lesson9.fantan;

import Lesson9.trump.*;

public class Fantan {
    public static void main(String[] args) {
        Master master = new FantanMaster();
        Table table = new FantanTable();
        Rule rule = new FantanRule();

        Player murata = new FantanPlayer("村田", master, table, rule);
        Player yamada = new FantanPlayer("山田", master, table, rule);
        Player saito = new FantanPlayer("齊藤", master, table, rule);

        master.registerPlayer(murata);
        master.registerPlayer(yamada);
        master.registerPlayer(saito);

        Hand trump = createTrump();
        master.prepareGame(trump);
        master.startGame();
    }

    private static Hand createTrump() {
        Hand trump = new Hand();

        for (int number = 1; number <= Card.CARD_NUM; number++) {
            trump.addCard(new Card(Card.SUIT_CLUB, number));
            trump.addCard(new Card(Card.SUIT_DIAMOND, number));
            trump.addCard(new Card(Card.SUIT_HEART, number));
            trump.addCard(new Card(Card.SUIT_SPADE, number));
        }

        return trump;
    }
}
