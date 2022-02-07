
public class Cofins implements Imposto {

    @Override
    public double calculaImposto(double valor) {
        return valor > 17000 ? valor * 0.08 : valor * 0 ;
    }
}
