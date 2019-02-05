package Lesson5;

public class CyclicTactics implements Tactics {
    private int battleCount_ = 0;

    public int readTactics() {
        int hand = 0;

        if (battleCount_ % 3 == 0) {
            hand = Player.STONE;
        } else if (battleCount_ % 3 == 1) {
            hand = Player.SCISSORS;
        } else if (battleCount_ % 3 == 2) {
            hand = Player.PAPER;
        }

        battleCount_++;
        return hand;
    }
}
