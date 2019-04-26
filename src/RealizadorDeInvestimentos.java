public class RealizadorDeInvestimentos {

    public void realizaInvestimento(Conta conta, Investimento investimento) {
        double resultado = investimento.calcula(conta);
        conta.deposita(resultado * 0.75);
        System.out.println("Novo saldo: " + conta.getSaldo());
    }
}
