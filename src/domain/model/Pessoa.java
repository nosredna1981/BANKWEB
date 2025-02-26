package domain.model;

public class Pessoa {

    private String nome;
    private String cpf;
    private String cnpj;
    private String dataNasc;
    private String email;
    private String tel;

    // NOME

    public Pessoa(String nome, String email, String Tel) throws Exception {
        this.setNome(nome);  //   this.setNome = nome
        this.setEmail(email);  // this.setEmail = email
        this.setTel(Tel);  //  this.setTel = Tel

    }

    public void setNome (String nome) throws Exception {
        if (nome.trim().equals(""))
            throw new Exception("Nome em Branco!");
        this.nome = nome.trim();
    }
    public String getNome(){
        return this.nome;
    }

    // CPF

    public void setCpf (String cpf){
            this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    // CNPJ

    public void setCnpj (String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
    return this.cnpj;
    }

    // DATA DE NASCIMENTO

    public void setDataNasc (String dataNasc){
        this.dataNasc = dataNasc;
    }
    public String getDataNasc(){
    return this.dataNasc;
    }

    // EMAIL

    public void setEmail (String email){
        this.email = email;
    }
    public String getEmail(){
    return this.email;
    }

    // TELEFONE

    public void setTel (String tel){
        this.tel = tel;
    }
    public String getTel(){
    return this.tel;
    }
    
}



