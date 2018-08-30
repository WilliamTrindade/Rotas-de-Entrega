package model;

public class Funcionario {
    //atributos
    private String nome;
    private Double salario;
    
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    public Double getSalario(){
        return this.salario;
    }
}
