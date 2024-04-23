/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Agendamento {
    private int id;
    private Cliente clinte;
    private Servico servico;
    private float valor;
    private Date dataSaida;
    private int numeroQuarto ;
    private int NumeroAndar;;
    private Date dataEntrada;
    private String observacao;

    public Agendamento(int id, Cliente clinte, Servico servico, float valor, String dataSaida, int numeroQuarto, int NumeroAndar, String dataEntrada) {
        this.id = id;
        this.clinte = clinte;
        this.servico = servico;
        this.valor = valor;
        this.numeroQuarto = numeroQuarto;
        this.NumeroAndar = NumeroAndar;
        try{
        this.dataSaida = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(dataSaida);
        
        }catch (ParseException ex){Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE,null,ex);
    }
        try {
            this.dataEntrada = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(dataEntrada);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getClinte() {
        return clinte;
    }

    public void setClinte(Cliente clinte) {
        this.clinte = clinte;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public int getNumeroAndar() {
        return NumeroAndar;
    }

    public void setNumeroAndar(int NumeroAndar) {
        this.NumeroAndar = NumeroAndar;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }




   
    }
    