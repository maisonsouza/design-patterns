public class Reprovado  implements EstadoDeUmOrcamento{
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem ter desconto extra");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Já foi reprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Já foi reprovado");

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoatual = new Finalizado();
    }
}
