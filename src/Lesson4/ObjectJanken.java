package Lesson4;

public class ObjectJanken {
    public static void main(String[] args) {
        Judge saito = new Judge();

        Murata murata = new Murata("村田さん");
        Yamada yamada = new Yamada("山田さん");

        saito.startJanken(murata, yamada);
    }
}
