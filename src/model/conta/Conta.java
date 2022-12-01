package model.conta;

public abstract class Conta {

    private Double saldo;
    private Double taxa;

    public Double getSaldo() {
        return saldo;
    }

    protected void addSaldo(Double valor){
        this.saldo+=valor;
    }

    protected void removeSaldo(Double valor){
        this.saldo-=valor;
    }

}
