package org.example.lutarboxe;
public class Main {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("Anderson Silva", "Brasil", 40, 1.88f, 57.0f, 20, 5, 2);
        Lutador l2 = new Lutador("Aberaldo gay", "grécia", 40, 1.86f, 85.0f, 20, 5, 2);
        Lutador l3 = new Lutador("Maristelo Gonzaga", "italia", 40, 1.94f, 55.0f, 20, 5, 2);
        Lutador l4 = new Lutador("Nivaldo Tarantino", "frança", 40, 1.80f, 60.0f, 20, 5, 2);
        Lutador l5= new Lutador("Balconi riso", "belgica", 40, 1.85f, 72.0f, 20, 5, 2);
        Lutador l6 = new Lutador("Cabelosi careca", "colombia", 40, 1.78f, 83.0f, 20, 5, 2);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l1, l1);
        UEC01.lutar();
        l1.status();
        l2.status();

    }
}



