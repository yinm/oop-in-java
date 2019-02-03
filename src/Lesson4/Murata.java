package Lesson4;

public class Murata {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name_;
    private int winCount_ = 0;

    public Murata(String name) {
        this.name_ = name;
    }

    /**
     * @return ジャンケンの手
     */
    public int showHand() {
        double randomNum = Math.random() * 3;

        if (randomNum < 1) {
            return STONE;
        } else if (randomNum < 2) {
            return SCISSORS;
        } else if (randomNum < 3) {
            return PAPER;
        }

        return 0;
    }

    /**
     * @param result true: 勝ち, false: 負け
     */
    public void notifyResult(boolean result) {
        if (result) {
            this.winCount_++;
        }
    }

    /**
     * @return 勝った回数
     */
    public int getWinCount() {
        return this.winCount_;
    }

    public String getName() {
        return name_;
    }
}
