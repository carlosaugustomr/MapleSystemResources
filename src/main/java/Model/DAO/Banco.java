/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    private static Servico servico1;
    private static Cliente cliente3;
    private static Cliente cliente4;
    private static Cliente cliente5;
    private static Cliente cliente6;
    private static Cliente cliente7;
    private static Cliente cliente8;
    private static Cliente cliente9;
    private static Cliente cliente10;
    private static Cliente cliente11;
    private static Servico servico2;
    private static Servico servico3;
    private static Servico servico4;
    private static Servico servico5;
    private static Servico servico6;
    private static Agendamento agendamento2;
    private static Agendamento agendamento3;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        Usuario usuario1 = null;
        
       
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        Usuario usuario2 = null;
        usuario.add(usuario2);
        Cliente cliente1 = null;
        
        cliente.add(cliente1);
        Cliente cliente2 = null;
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        cliente.add(cliente11);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        Agendamento agendamento1 = null;
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
