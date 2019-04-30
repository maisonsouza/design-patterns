public abstract class TemplateDeImpostoCondicional extends Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarTaxacaoMaxima(orcamento)){
            return maximaTaxacao(orcamento)+ outroImposto.calcula(orcamento);
        }else{
            return minimaTaxacao(orcamento)+ outroImposto.calcula(orcamento);
        }
    }

    protected abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento) ;
    protected abstract double minimaTaxacao(Orcamento orcamento) ;
}
