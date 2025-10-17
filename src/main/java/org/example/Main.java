package org.example;


public class Main {
    public static void main(String[] args) {
    ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.desligar();
        c.abrirMenu();
        c.fecharMenu();
        c.maisVolume();
        c.menosVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.play();
        c.pause();
    }
}