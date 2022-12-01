package model.conta;

public enum TipoConta {
    CORRENTE(ContaCorrente.class),
    INVESTIMENTO (ContaInvestimento.class),
    POUPANCA (ContaPoupanca.class);

    private Class<? extends Conta> conta;

    TipoConta(Class<? extends Conta> conta) {
        this.conta = conta;
    }

    public Class<? extends Conta> getConta() {
        return conta;
    }
}
