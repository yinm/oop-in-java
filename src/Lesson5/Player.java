package Lesson5;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name_;
    private int winCount_ = 0;
    private Tactics tactics_;

    public Player(String name) {
        this.name_ = name;
    }

    /**
     * @return ジャンケンの手
     */
    public int showHand() {
        return tactics_.readTactics();
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

    public void setTactics(Tactics tactics) {
        tactics_ = tactics;
    }
}
