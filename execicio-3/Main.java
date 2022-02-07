
public class Main {

    public static void main(String[] args) {

        Produto banana = new Produto("Banana", 0.99, Tipo.DOIS);
        Produto energetico = new Produto("Energético", 5.49, Tipo.TRES);
        Produto arroz = new Produto("Arroz", 20, Tipo.UM);
        Produto chocolate = new Produto("Chocolate", 4.5, Tipo.UM);
        Produto leite = new Produto("Leite", 3.73, Tipo.TRES);
        Produto abacaxi = new Produto("Abacaxi", 2.4, Tipo.DOIS);

        Caixa caixa = new Caixa();

        banana.printaProduto(caixa.calculaValorFinal(banana, 3));
        System.out.println();
        energetico.printaProduto(caixa.calculaValorFinal(energetico, 7));
        System.out.println();
        arroz.printaProduto(caixa.calculaValorFinal(arroz, 1));
        System.out.println();
        chocolate.printaProduto(caixa.calculaValorFinal(chocolate, 12));
        System.out.println();
        leite.printaProduto(caixa.calculaValorFinal(leite, 5));
        System.out.println();
        abacaxi.printaProduto(caixa.calculaValorFinal(abacaxi, 1));


    }
}
