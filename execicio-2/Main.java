import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        String valor = scanner.nextLine();

        while (!valor.matches("[0-9]+")) {
            System.out.println("Digite um número válido: ");
            valor = scanner.nextLine();
        }
        double valorDouble = Double.parseDouble(valor);

        Icms icms = new Icms();
        double valorIcms = icms.calculaImposto(valorDouble);
        System.out.println(valorIcms);

        Ipi ipi = new Ipi();
        double valorIpi = ipi.calculaImposto(valorDouble);
        System.out.println(valorIpi);

        Cofins cofins = new Cofins();
        double valorCofins = cofins.calculaImposto(valorDouble);
        System.out.println(valorCofins);

        double valorFinal = valorDouble + valorIpi + valorIcms + valorCofins;

        System.out.println("Valor final: " + valorFinal);
    }
}
