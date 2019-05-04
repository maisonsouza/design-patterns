public class TesteDaNotaFiscal {

    public static void main(String[] args) {
       NotaFiscalBuider builder = new NotaFiscalBuider();
       builder.paraEmpresas("Caelum Ensino e Inovação")
       .comCnpj("12.345.678/0001-12")
       .comItem(new ItemDaNota("item1",200))
       .comItem(new ItemDaNota("item2",300))
       .comItem(new ItemDaNota("item3",400))
       .comObservacoes("Observações")
       .naDataAtual();

       NotaFiscal nf = builder.constroi();
       System.out.println(nf.getValorBruto());



    }
}
