public class ICMS extends Imposto{

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + 50.0 + calculoDoOutroImposto(orcamento);
    }
}
