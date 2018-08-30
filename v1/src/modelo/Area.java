package modelo;

import java.util.ArrayList;

public class Area {
    private String nome;
    private ArrayList<Rota> rotas 
            = new ArrayList<>();
    private Funcionario colaborador;

    public Area(String nome, Funcionario colaborador) {
        this.nome = nome;
        this.colaborador = colaborador;
    }   
    
    public Area(String nome) {
        this.nome = nome;
    }   
    
    public Area(String nome, ArrayList<Rota> rotas, Funcionario colaborador) {
        this.nome = nome;
        this.rotas = rotas;
        this.colaborador = colaborador;
    }

    public void adicionarRota(Rota r){
        this.rotas.add(r);
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(ArrayList<Rota> rotas) {
        this.rotas = rotas;
    }

    public Funcionario getColaborador() {
        return colaborador;
    }

    public void setColaborador(Funcionario colaborador) {
        this.colaborador = colaborador;
    }
    
    
    
}
