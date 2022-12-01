package model.conta;

import model.conta.Conta;
import model.conta.TipoConta;

public interface ContaFactory {
    Conta criarConta(TipoConta tipoConta);
}
