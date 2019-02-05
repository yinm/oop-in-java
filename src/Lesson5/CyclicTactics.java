package Lesson5;

public class CyclicTactics implements Tactics {
    private int lastHand = -1;

    public int readTactics() {
        lastHand = (lastHand + 1) % 3;

        return lastHand;
    }
}
