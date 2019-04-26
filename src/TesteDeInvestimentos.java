public class TesteDeInvestimentos {
    public static void main(String[] args) {
        Moderado investimentoModerado = new Moderado();
        Arrojado investimentoArrojado= new Arrojado();
        Conservador investimentoConservador = new Conservador();
        Conta conta1 = new Conta();
        conta1.deposita(100,"Maison");
        RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();
        realizador.realizaInvestimento(conta1,investimentoModerado);
        realizador.realizaInvestimento(conta1,investimentoConservador);
        realizador.realizaInvestimento(conta1,investimentoArrojado);
    }
}
