import domain.model.Agencia;
import domain.model.Conta;
import domain.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
       
        try {        
       

        Agencia agencia = new Agencia();
        Pessoa pessoa = new Pessoa("Anderson","andymarques1@email.com","+55 (21) 4444-55555");
        Conta conta = new Conta();
        

        agencia.nome = "Campo Grande";
        agencia.numero = "001";
        agencia.email = "campogrande@bankweb.com";
        agencia.tel = "+55 (21) 555-55555";

        // pessoa.setNome("Anderson");
        pessoa.setCpf("111.222.333-44");
        pessoa.setCnpj("34.283.131.0001-45");
        pessoa.setDataNasc("01/01/1111");
        // pessoa.setTel("+55 (21) 4444-55555");
        // pessoa.setEmail("andymarques1@email.com");
        

        conta.numero = "100001";
        conta.agencia = agencia;
        conta.pessoa = pessoa;
        conta.saldo = 1000;

        System.out.println("Agencia: "+ conta.agencia.nome);
        System.out.println("Cliente: "+ conta.pessoa.getNome());
        System.out.println("Saldo: "+ conta.saldo);

    } catch (Exception e) {
        System.err.println(e.getMessage());
    }

    }
}
