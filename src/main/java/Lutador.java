import org.example.lutarboxe.Capsula;


public class Lutador implements Capsula {
    private String nome;
    private String nacionalidade;
    private int idade;
    private Float altura;
    private Float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private boolean status;

    public Lutador() {
        this.nome = null;
        this.nacionalidade = null;
        this.idade = 0;
        this.altura = 0.0f;
        this.peso = 0.0f;
        this.categoria = null;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.status = false;
    }
//metódos especiais
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

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
//Apresentação do lutador
    @Override
    public void apresentar() {
        System.out.println("Este é o lutador " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println(this.nacionalidade);
        System.out.println(this.altura + " de altura");
        System.out.println("Pesando " + this.peso +" kgs");
        System.out.println("Que compete pela categoria "+ this.categoria);
        System.out.println("Ao longo de sua carreira coleciona " + this.vitorias + " tendo" + this.derrotas +"derrotas e "+ this.empates+ "empates!");
    }

    @Override
    public void status() {
        if (this.nome != null) {
            this.status = true;
            System.out.println("Lutador Cadastrado");
        }

    }

    @Override
    public void ganharLuta() {
            if (this.peso > this.peso && this.vitorias > this.vitorias) {
            System.out.println("Lutador" + this.nome + "é o vencedor");
        }
    }

    @Override
    public void perderLuta() {
        if (this.peso < this.peso && this.vitorias < this.vitorias) {
            System.out.println("Lutador" + this.nome + "é o vencedor!");
        }
    }
    @Override
    public void empatarLuta() {
        if (this.vitorias == this.vitorias && this.peso == this.peso) {
            System.out.println("EMPATE!!!");
        }

    }
}

