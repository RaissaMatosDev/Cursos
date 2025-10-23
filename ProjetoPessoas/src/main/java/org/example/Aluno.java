package org.example;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;


    private void cancelarMatricula() {
        System.out.println("matricula será cancelada!");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
