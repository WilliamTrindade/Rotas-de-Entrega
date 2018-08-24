package model;

import java.util.ArrayList;

public class Rota {
    //atributos
    private String nome;
    private ArrayList<Cliente> pontosEntrega;
    private Funcionario entregador;
    
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPontosEntrega(ArrayList<Cliente> pontosEntrega){
        this.pontosEntrega = pontosEntrega;
    }
    public void setFuncionario(Funcionario entregador){
        this.entregador = entregador;
    }
    
    public String getNome(){
        return this.nome;
    }
    public ArrayList<Cliente> getPontosEntrega(){
        return this.pontosEntrega;
    }
    public Funcionario getEntregador(){
        return entregador;
    }
}
