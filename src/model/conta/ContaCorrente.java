package model.conta;

public class ContaCorrente extends Conta implements ContaSacar, ContaDepositar, ContaTransferir {


    @Override
    public void depositar(Double valor) {

    }


    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void transferir(Double valor, Conta conta) {

    }
}
