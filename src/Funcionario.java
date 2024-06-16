import java.util.ArrayList;
import java.util.Scanner;


public class Funcionario extends Pessoa{
    private double salario;
    private String senha;
    private String cargo;
    Funcionario(){}

    public Funcionario(String nome, int idade, String genero, String cpf, String cargo, String senha, double salario){
        super(nome, idade, genero, cpf);
        setCargo(cargo);
        setSenha(senha);
        setSalario(salario);
    }
    
    Scanner sc = new Scanner(System.in);
    public void instanciaFuncionario(ArrayList<Pessoa> funcionarios){
        funcionarios.add(new Funcionario("Lucas", 36, "M", "573.407.780-12", "Farmaceutico", "senha1", 5000.0));
        funcionarios.add(new Funcionario("Maria", 26, "F", "912.724.110-60","Caixa", "senha2", 3000.0));
        funcionarios.add(new Funcionario("Lurdes", 29, "F", "187.875.440-83", "Assistente de farmacia", "senha3", 2500.0));
        funcionarios.add(new Funcionario("Luana", 31, "F", "562.123.050-72","Tecnico de farmacia", "senha4", 3500.0));
        funcionarios.add(new Funcionario("Pedro", 25, "M", "263.773.090-07",  "Assistente Administrativo", "senha5", 2600.0));
    }

    public void listaFuncionarios(ArrayList<Pessoa> funcionarios){
        for (Pessoa f : funcionarios){
            System.out.println(f.toString());
            System.out.println("=====================================");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString(){
        return  "Funcionário:" + "\n" +
                "Nome: " + getNome() + "\n" +
                "idade: " + getIdade() + "\n" +
                "Gênero: " + getGenero() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Cargo: " + getCargo() + "\n" +
                "Salario R$" + getSalario() + "\n" +
                "ID:" + getId();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
