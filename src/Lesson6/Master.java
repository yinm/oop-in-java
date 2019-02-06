package Lesson6;

import java.util.ArrayList;

public class Master {
    private ArrayList players_ = new ArrayList();

    public void prepareGame(Hand cards) {
        System.out.println("【カードを配ります】");
        cards.shuffle();
        int numberOfCards = cards.getNumberOfCards();
        int numberOfPlayers = players_.size();

        for (int index = 0; index < numberOfCards; index++) {
            Card card = cards.pickCard();
            Player player = (Player) players_.get(index % numberOfPlayers);
            player.receiveCard(card);
        }
    }

    public void startGame() {
        System.out.println("\n【ばば抜きを開始します】");

        for (int count = 0; players_.size() > 1; count++) {
            int playerIndex = count % players_.size();
            int nextPlayerIndex = (count + 1) % players_.size();
            Player player = (Player) players_.get(playerIndex);
            Player nextPlayer = (Player) players_.get(nextPlayerIndex);

            System.out.println("\n" + player + "さんの番です");
            player.play(nextPlayer);
        }

        System.out.println("【ばば抜きを終了しました】");
    }

    public void declareWin(Player winner) {
        System.out.println(winner + "さんが上がりました！");
        players_.remove(players_.indexOf(winner));

        if (players_.size() == 1) {
            Player loser = (Player) players_.get(0);
            System.out.println(loser + "さんの負けです！");
        }
    }

    public void registerPlayer(Player player) {
        players_.add(player);
    }
}
