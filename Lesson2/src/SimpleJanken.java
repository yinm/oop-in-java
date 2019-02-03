public class SimpleJanken {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    public static void main(String[] args) {
        int player1WinCount = 0;
        int player2WinCount = 0;

        int player1Hand = 0;
        int player2Hand = 0;

        double randomNum = 0;

        System.out.println("じゃんけん開始\n");

        for (int i = 0; i < 3; i++) {
            randomNum = Math.random() * 3;
            if (randomNum < 1) {
                player1Hand = STONE;
                System.out.println("グー");
            } else if (randomNum < 2) {
                player1Hand = SCISSORS;
                System.out.println("チョキ");
            } else if (randomNum < 3) {
                player1Hand = PAPER;
                System.out.println("パー");
            }

            randomNum = Math.random() * 3;
            if (randomNum < 1) {
                player2Hand = STONE;
                System.out.println("グー");
            } else if (randomNum < 2) {
                player2Hand = SCISSORS;
                System.out.println("チョキ");
            } else if (randomNum < 3) {
                player2Hand = PAPER;
                System.out.println("パー");
            }

            if (
            (player1Hand == STONE && player2Hand == SCISSORS) ||
            (player1Hand == SCISSORS && player2Hand == PAPER) ||
            (player1Hand == PAPER && player2Hand == STONE)
            ) {
                player1WinCount++;
                System.out.println("\nプレイヤー1が勝ちました！\n");
            } else if (
            (player1Hand == STONE && player2Hand == PAPER) ||
            (player1Hand == SCISSORS && player2Hand == STONE) ||
            (player1Hand == PAPER && player2Hand == SCISSORS)
            ) {
                player2WinCount++;
                System.out.println("\nプレイヤー2が勝ちました！\n");
            } else {
                System.out.println("\n引き分けです！\n");
            }
        }

        System.out.println("じゃんけん終了\n");

        if (player1WinCount > player2WinCount) {
            System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー1の勝ちです！\n");
        } else if (player1WinCount < player2WinCount) {
            System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー2の勝ちです！\n");
        } else if (player1WinCount == player2WinCount) {
            System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです！\n");
        }
    }
}
