
public class Produto {

    private String nome;

    private double valor;

    private Tipo tipo;

    public Produto(){}

    public Produto(String nome, double valor, Tipo tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo(){
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void printaProduto(Double valorTotal){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Valor total: " + valorTotal);
    }
}
