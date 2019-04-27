public class ICPP extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
        return orcamento.getValor()>500;
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
