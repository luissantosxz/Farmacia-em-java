import java.util.ArrayList;
import java.util.Scanner;

public class Remedio extends Produto {
    private double mg;
    private boolean usoAdulto;
    private boolean precisaReceita;
    Scanner sc = new Scanner(System.in);

    public Remedio() {
    }

    public Remedio(String nome, double preco, int quantidade, double mg, boolean usoAdulto, boolean precisaReceita) {
        super(nome, preco, quantidade);
        this.mg = mg;
        this.usoAdulto = usoAdulto;
        this.precisaReceita = precisaReceita;
    }

    public void listaRemedios(ArrayList<Produto> produtos) {
        for (Produto r : produtos) {
            if (r instanceof Remedio) {
                System.out.println(r.toString());
                System.out.println("=====================================");
            }
        }
    }

    public Produto encontrarRemedioPorId(ArrayList<Produto> remedios) {
        System.out.println("Digite o ID do remedio que vc quer encontrar:");
        int id = sc.nextInt();
        for (Produto produto : remedios) {
            if (produto.getId() == id) {
                System.out.println("PRODUTO ENCONTRADO");
                System.out.println(produto);
                return produto;
            }
        }
        System.out.println("ID INVALIDO");
        return null;
    }

    public Produto editarRemedio(int id, ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto instanceof Remedio && produto.getId() == id) {
                System.out.println("Digite o novo nome do produto");
                produto.setNome(sc.next());
                System.out.println("Digite o novo Preco do produto");
                produto.setPreco(sc.nextDouble());
                System.out.println("Digite a nova quantidade do produto");
                produto.setQuantidade(sc.nextInt());
                return produto;
            }
        }
        System.out.println("Produto com ID " + id + " não foi encontrado.");
        return null;
    }

    public Produto removerRemedio(int id, ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto instanceof Remedio && produto.getId() == id) {
                produtos.remove(produto);
                System.out.println("PRODUTO FOI REMOVIDO!");
                return produto;
            }
        }
        System.out.println("Produto com ID " + id + " não foi encontrado.");
        return null;
    }

    public double getMg() {
        return mg;
    }

    public void setMg(double mg) {
        this.mg = mg;
    }

    public boolean isUsoAdulto() {
        return usoAdulto;
    }

    public void setUsoAdulto(boolean usoAdulto) {
        this.usoAdulto = usoAdulto;
    }

    public boolean isPrecisaReceita() {
        return precisaReceita;
    }

    public void setPrecisaReceita(boolean precisaReceita) {
        this.precisaReceita = precisaReceita;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMG: " + mg + "\nUso adulto: " + usoAdulto + "\nPrecisa receita: " + precisaReceita;
    }
}
