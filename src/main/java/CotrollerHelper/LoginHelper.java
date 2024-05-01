/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CotrollerHelper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author carlo
 */
public class LoginHelper {
    private final Login view; 

    public LoginHelper(Login view) {
        this.view = view;
        
    }
    public Usuario obterModelo(){        
        String nome = view.getTextUsuario().getText();
        var senha = view.getTextSenha().getText();
        Usuario modelo = new Usuario(0,nome,senha);
        return modelo;
    }
    public void setarModelo(Usuario modelo){
        String nome= modelo.getNome();
        String senha= modelo.getSenha();
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
       
    }
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }

   
}
