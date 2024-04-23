/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import CotrollerHelper.LoginHelper;
import Model.Usuario;
import View.Login;
/**
 *
 * @author carlo
 */

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    public LoginController(Login view){
        this.view = view;
        this.helper= new LoginHelper(view);
        
    }
    public void entrarNoSistema(){
        Usuario usuario= helper.obterModelo();

    }
    public void fizTarefa(){
        System.out.print("busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa"); 
    }
}
