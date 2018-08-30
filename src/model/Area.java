package model;

import java.util.ArrayList;

public class Area {
    
    
    //atributos
    private String nome;
    private Funcionario colaborador; 
    private ArrayList<Rota> entregas = new ArrayList();
    //construtores
    public Area(){
        
    }
    public Area(String nome){
        
    } 
    public Area(String nome, Funcionario colaborador){
        
    }
    
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEntregas(ArrayList<Rota> entregas){
        this.entregas = entregas;
    }
    public void adicionarRota(Rota x){
        entregas.add(x);
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
    
    public void imprimeArea(Area area){
        System.out.println("Imprimindo Area");
        System.out.println("Nome: " + area.getNome());
        System.out.println("Colaborador: " + getColaborador().getNome());
        int i;
        System.out.println("Rotas : \n");
        for(i=0;i<2;i++){
            System.out.println(area.getEntregas().get(i).getNome());
            System.out.println(area.getEntregas().get(i).getEntregador().getNome());
        }
        
        

    }
            
   
  
    
}
