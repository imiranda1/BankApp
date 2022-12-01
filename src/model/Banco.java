package model;

import model.cliente.Cliente;
import model.conta.*;

import java.util.List;

public class Banco implements ContaAbrir {
    private List<Cliente> clienteList;
    private List<Conta> contaList;

    @Override
    public Conta abrirConta(Cliente cliente, TipoConta tipoConta) {




        ContaFactory contaFactory = new ContaFactoryImpl();
        Conta conta = contaFactory.criarConta(tipoConta);
        cliente.addConta(conta);
        clienteList.add(cliente);
        contaList.add(conta);
        return conta;
    }
}
