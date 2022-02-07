public class Icms implements Imposto {

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.3;
    }
}
