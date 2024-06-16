public abstract class Pessoa {

    private String nome;
    private int idade;
    private String genero;
    private String cpf;
    private static int contador = 1;
    private int id;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String genero, String cpf){
        setNome(nome);
        setIdade(idade);
        setGenero(genero);
        setCpf(cpf);
        setId(contador);
        Pessoa.contador += 1;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String toString(){
        return  "Nome: " + getNome() + "\n" +
                "idade: " + getIdade() + "\n" +
                "Gênero: " + getGenero() + "\n" +
                "CPF: " + getCpf();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
