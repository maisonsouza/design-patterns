public abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarTaxacaoMaxima(orcamento)){
            return maximaTaxacao(orcamento);
        }else{
            return minimaTaxacao(orcamento);
        }
    }

    protected abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);
    public abstract double maximaTaxacao(Orcamento orcamento) ;
    public abstract double minimaTaxacao(Orcamento orcamento) ;
}
