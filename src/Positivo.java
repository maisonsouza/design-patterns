public class Positivo implements EstadoDaConta {
    @Override
    public void saca(Conta conta, double valor) {
        conta.saldo -= valor;
    }

    @Override
    public void deposita(Conta conta, double valor) {

    }
}
