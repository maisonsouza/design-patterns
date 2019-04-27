public class Conservador implements Investimento {

    @Override
    public double calculaInvestimento(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
}
