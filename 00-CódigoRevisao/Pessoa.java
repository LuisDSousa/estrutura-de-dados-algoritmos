public class Pessoa{
    private String nome;
    public long cpf;
    private int idade;
    
    public Pessoa(){
        this("",0,0);
    }

    public Pessoa(String nome, int idade) {
        this(nome, 0, idade);
    }
    
    public Pessoa(String nome, long cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade;
    }
    
}