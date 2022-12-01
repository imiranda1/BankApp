import model.Banco;
import model.conta.ContaFactoryImpl;
import model.conta.ContaFactory;
import model.cliente.Cliente;
import model.cliente.ClientePF;
import model.conta.Conta;
import model.conta.TipoConta;

public class Aplicacao {

    public static void main(String[] args) {
        Banco santander = new Banco();
        Cliente c1 = new ClientePF("12345678901");

        ContaFactory contaFactory = new ContaFactoryImpl();
        Conta conta = contaFactory.criarConta(TipoConta.CORRENTE);




    }
}
