public class IHIT extends TemplateDeImpostoCondicional{

    @Override
    protected boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
        return false;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor()*0.13 + 100;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor()*0.01+orcamento.getItens().size();
    }
}
