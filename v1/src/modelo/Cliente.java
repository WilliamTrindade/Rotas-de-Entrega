package modelo;

public class Cliente {

    private String nome;
    private String rua;
    private int numero;
    private String cpf;
    
    
    // metodo construtor
    
    public Cliente(){
        
    }
     public Cliente(String nome, String cpf){
       this.cpf = cpf;
       this.nome = nome;
    }
    public Cliente(String cpf){
        System.out.println("Criando objstos cliente ...");
        setCpf(cpf);
    }
    
    
    public void comprar(String produto){
        // faz algo
    }
    
    public void comprar(String produto, float desconto){
       //faz alguma coisa com o descont e compra
        comprar(produto);
    }
    
    // visibilidade
    // tipo de retorno
    // nome do método (com ou sem atributos)
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    } 

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        if(numero < 1){
            this.numero = 0;
        }else{
            this.numero = numero;
        }      
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
