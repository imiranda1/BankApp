package model.conta;

import model.cliente.Cliente;

public interface ContaAbrir {

    Conta abrirConta(Cliente cliente, TipoConta tipoConta);
}
