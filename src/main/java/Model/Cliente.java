/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author carlo
 */
public class Cliente extends Pessoa {
    protected String endereco ;
    protected int cep;

    public Cliente(String endereco, int cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String cpf) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(String endereco, int cep, int id, String nome) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    

}
