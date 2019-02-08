package Lesson9.fantan;

import Lesson9.trump.Master;

public class FantanMaster extends Master {
    public static final int PASS_LIMIT = 3;

    public void pass(FantanPlayer player) {
        System.out.println(" " + player + "さんは " + player.getPass() + " 回目のパスしました！");

        if (player.getPass() > PASS_LIMIT) {
            System.out.println("  " + player + "さんは負けです！");
            deregisterPlayer(player);
        }
    }
}
