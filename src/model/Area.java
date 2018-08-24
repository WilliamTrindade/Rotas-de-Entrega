package model;

import java.util.ArrayList;

public class Area {
    //atributos
    private String nome;
    private ArrayList<Rota> entregas;
    private Funcionario colaborador; 
    
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEntregas(ArrayList<Rota> entregas){
        this.entregas = entregas;
    }   
    public void setColaborador(Funcionario colaborador){
        this.colaborador = colaborador;
    }
    
    public String getNome(){
        return this.nome;
    }
    public ArrayList<Rota> getEntregas(){
        return entregas;
    }
    public Funcionario getColaborador(){
        return colaborador;
    }
}
