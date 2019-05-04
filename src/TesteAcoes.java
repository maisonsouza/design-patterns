public class TesteAcoes {
    public static void main(String[] args) {
        NotaFiscalBuider builder = new NotaFiscalBuider();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDAO());
        builder.adicionaAcao(new EnviadorDeSMS());
        builder.adicionaAcao(new Impressora());

        NotaFiscal nf = builder.paraEmpresas("caelum").comCnpj("123").comItem(new ItemDaNota("ITEM1", 100)).comObservacoes("observascao").naDataAtual().constroi();


    }
}
