package model.conta;

public class ContaFactoryImpl implements ContaFactory{
    @Override
    public Conta criarConta(TipoConta tipoConta) {
        switch (tipoConta){
            case CORRENTE:
                return new ContaCorrente();
            case INVESTIMENTO:
                return new ContaInvestimento();
            case POUPANCA:
                return new ContaPoupanca();
        }
        return null;
    }
}

