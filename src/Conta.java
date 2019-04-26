class Conta {
    private double saldo;
    private String nome;
    private int numero;
    private int agencia;


    public void deposita(double valor, String titular) {
        this.saldo += valor;
        this.nome = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return nome;
    }


    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return this.agencia;
    }
}