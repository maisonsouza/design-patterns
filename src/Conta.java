class Conta {
    private double saldo;
    private String titular;

    public String getTitular() {
        return titular;
    }

    public void deposita(double valor, String titular) {
        this.saldo += valor;
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
}