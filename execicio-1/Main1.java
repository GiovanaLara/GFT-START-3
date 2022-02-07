import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        String fraseExemplo = "Acabou o café";
        String Primeirafrase = "Na minha máquina funciona";
        String segundafrase = "Eu posso pular o teste";
        String terceirafrase = "Isso não deve demorar";

        System.out.println("Última Palavra da frase exemplo tem: " + getPalavraUltimoEspaco(fraseExemplo).length());

        System.out.println("Última Palavra da primeira frase tem: " + getPalavraUltimoEspaco(Primeirafrase).length()
                + " letras");
        System.out.println("Última Palavra da segunda frase tem: " + getPalavraUltimoEspaco(segundafrase).length()
                + " letras");
        System.out.println("Última Palavra da terceira frase tem: " + getPalavraUltimoEspaco(terceirafrase).length()
                + " letras");
    }

    private static String getPalavraUltimoEspaco(String frase) {
        return frase.substring(frase.lastIndexOf(" ") + 1);
    }
}
