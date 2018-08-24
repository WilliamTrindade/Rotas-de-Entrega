package model;

public class Cliente {
    //atributos
    private String nome;
    private String endereco;
    private String latitude;
    private String longitude;
    
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setLatitude(String latitude){
        this.latitude = latitude;
    }
    public void setLongitude(String longitude){
        this.longitude = longitude;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getLatitude(){
        return this.latitude;
    }
    public String getLongitude(){
        return this.longitude;
    }
}
