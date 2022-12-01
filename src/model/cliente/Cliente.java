package model.cliente;

import model.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public abstract class  Cliente {
    private String documento;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String documento) {
        this.documento = documento;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
}
