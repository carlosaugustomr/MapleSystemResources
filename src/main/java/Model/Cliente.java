/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author carlo
 */
public class Cliente extends Pessoa {
    private String endereco;
    private String cep;

    public Cliente(String endereco, String cep, int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(String endereco, String cep, int id, String nome, char sexo) {
        super(id, nome, sexo);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, char cep) {
        super(id, nome, cep);
    }
    
}
