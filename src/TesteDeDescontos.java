public class TesteDeDescontos {
    public static void main(String[] args) {
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();
        Orcamento orcamento = new Orcamento(501.0);
        orcamento.adicionaItem(new Item("Caneta",250));
        orcamento.adicionaItem(new Item("Lápis",250));
        System.out.println(descontos.calcula(orcamento));

    }
}
