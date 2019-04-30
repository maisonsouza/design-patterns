public class ICPP extends TemplateDeImpostoCondicional {

    public ICPP(Imposto outroImposto) {
      this.outroImposto = outroImposto;
    }

    public ICPP() {

    }

    @Override
    protected boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
        return orcamento.getValor()>500 + calculoDoOutroImposto(orcamento);
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor()*0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor()*0.05;
    }
}
