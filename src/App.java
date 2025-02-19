import domain.model.Agencia;
import domain.model.Conta;
import domain.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Agencia agencia = new Agencia();
        Pessoa pessoa = new Pessoa();
        Conta conta = new Conta();
        

        agencia.nome = "Campo Grande";
        agencia.numero = "001";
        agencia.email = "campogrande@bankweb.com";
        agencia.tel = "+55 (21) 555-55555";

        pessoa.nome = "Anderson Marques";
        pessoa.cpf = "111.222.333-44";
        pessoa.tel = "+55 (21) 4444-55555";
        pessoa.email = "andymarques1@email.com";

        conta.numero = "100001";
        conta.agencia = agencia;
        conta.pessoa = pessoa;

        System.out.println("Agencia: "+ conta.agencia.nome);
        System.out.println("Cliente: "+ conta.pessoa.nome);
        System.out.println("Saldo: "+ conta.saldo);


    }
}
