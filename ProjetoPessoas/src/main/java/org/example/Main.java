package org.example;

public class Main {
    public static void main(String[] args) {
        /// criação de novos objetos de classes diferentes
        Pessoa p1  = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        ///  nomeia os objetos da classe
        p1.setNome("Maria");
        p2.setNome("Josefa");
        p3.setNome("Cardoso");
        p4.setNome("Mirando");

        ///  converte para String (para imprimir corretamente no terminal)

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        /// seta as informações

        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("M");
        p4.setSexo("F");
        p1.setIdade(18);
        p4.FazerAniversario();
        p2.setCurso("Informática");
        p4.setSetor("INFRAESTRUTURA");
        p3.setSal(2000f);



    }
}