package org.example.lutarboxe;

public class Lutador {
    public String nome;
    public String nacionalidade;
    public int idade;
    public float altura;
    public float peso;
    public String categoria;
    public int vitorias;
    public int derrotas;
    public int empates;

    // Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
                   int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.setCategoria(); // define categoria automaticamente
    }

    // ===== GETTERS e SETTERS =====
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); // atualiza a categoria quando o peso muda
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (peso < 52.2) {
            categoria = "Inválido";
        } else if (peso <= 70.3) {
            categoria = "Leve";
        } else if (peso <= 83.9) {
            categoria = "Médio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // ===== MÉTODOS =====
    public void apresentar() {
        System.out.println("---------------------------------------");
        System.out.println("Apresentando o lutador: " + nome);
        System.out.println("Origem: " + nacionalidade);
        System.out.println(idade + " anos");
        System.out.println(altura + "m de altura");
        System.out.println("Pesando: " + peso + "kg");
        System.out.println("Categoria: " + categoria);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);
    }

    public void status() {
        System.out.println(nome + " é um peso " + categoria);
        System.out.println("Ganhou " + vitorias + " vezes");
        System.out.println("Perdeu " + derrotas + " vezes");
        System.out.println("Empatou " + empates + " vezes");
    }

    public void ganharLuta() {
        setVitorias(vitorias + 1);
    }

    public void perderLuta() {
        setDerrotas(derrotas + 1);
    }

    public void empatarLuta() {
        setEmpates(empates + 1);
    }
}


