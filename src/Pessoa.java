class Pessoa {
    String nome;
    int idade;
    String nacionalidade;
    String sexo;

    public Pessoa(String nome, int idade, String nacionalidade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Nacionalidade: " + nacionalidade + ", Sexo: " + sexo;
    }
}
