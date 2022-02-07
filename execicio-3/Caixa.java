public class Caixa {

    public double calculaValorFinal(Produto produto, Integer quantidade) {
        return produto.getValor() * quantidade;
    }
}
