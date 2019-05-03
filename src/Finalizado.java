public class Finalizado implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Estado finalizado não tem desconto");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já Finalizado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já Finalizado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já Finalizado");
    }
}
