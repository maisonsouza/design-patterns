public class TesteDeImpostos {
    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(500.0);
        CalculadorDeImposto calculadora = new CalculadorDeImposto();
        calculadora.realizaCalculo(orcamento,icms);
        calculadora.realizaCalculo(orcamento,iss);
        calculadora.realizaCalculo(orcamento,iccc);
    }
}
