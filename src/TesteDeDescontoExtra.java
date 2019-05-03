public class TesteDeDescontoExtra {
    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500);
        System.out.println(reforma.estadoatual);
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
        reforma.aprova();
        System.out.println(reforma.estadoatual);
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
        reforma.finaliza();
        reforma.aplicaDescontoExtra();
        reforma.reprova();
        reforma.aplicaDescontoExtra();


    }
}
