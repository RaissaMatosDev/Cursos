package org.example;

public class Main {
    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("Marcelo");
        v1.setIdade(16);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
       Aluno a1 = new Aluno() {

           //tag de sobreposição (metódos de mesmo nome)
           @Override
           public void pagarMensalidade() {
           }
       };
       //Passos seguidos e valores declarados para saida no terminal
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(15);
        a1.setSexo("M");
        a1.pagar_mensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileia");
        b1.setBolsa(12.5f);
        b1.setSexo("f");
        b1.pagarMensalidade();


    }
    }
