package model;

public class Funcionario {
    //atributos
    private String nome;
    private Float salario;
    
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(Float salario){
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    public Float getSalario(){
        return this.salario;
    }
}
