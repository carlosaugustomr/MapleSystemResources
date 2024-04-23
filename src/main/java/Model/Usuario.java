/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author carlo
 */
public class Usuario extends Pessoa {
    protected String senha;
    protected String nivelAcesso;

    public Usuario(String senha, String nivelAcesso, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String cpf) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String senha, String nivelAcesso, int id, String nome, String cpf) {
        super(id, nome, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario( int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSenha(String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
