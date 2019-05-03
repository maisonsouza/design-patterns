public class Aprovado implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.05;
            descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto já aplicado");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Esse Orçamento já foi Aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Já foi Aprovado não pode ser Reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoatual = new Finalizado();
    }
}
