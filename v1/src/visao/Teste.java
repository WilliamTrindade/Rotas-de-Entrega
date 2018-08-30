package visao;

import java.util.ArrayList;
import modelo.Area;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Rota;

public class Teste {

    public static void main(String args[]){

        Cliente cli1 = new Cliente();         
        cli1.setNome("Alencar1");
        cli1.setCpf("9879879871");
        cli1.setNumero(321);
        cli1.setRua("Roraima 10001");
        
        Cliente cli2 = new Cliente("987987");         
        Cliente cli3 = cli2; 
    
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);
        
        Funcionario paola = new Funcionario("Paola", 2589.00f);
        
        
        Rota rota = new Rota();
        rota.setNome("Camobi - Centro");
        rota.setPontosEntrega(clientes);
        rota.setEntregador(paola);
        
        Rota rota1 = new Rota();
        rota1.setNome("Tneves - Centro");
        rota1.setPontosEntrega(clientes);
        rota1.setEntregador(paola);
        
        System.out.println(" ");
        System.out.println("***** ROTAS");
        //imprimeRota(rota);
        
        System.out.println("******** AREA ***************");
        Area area = new Area("Área do bairro TNEVES", paola);
        area.adicionarRota(rota);
        area.adicionarRota(rota1);
        
        imprimeArea(area);
        
    }
    
    
   private static void imprimeArea(Area area){
       System.out.println("*** IMPRIMINDO ÁREA");
       System.out.println("Nome: "+area.getNome());
       System.out.println("Colaborador: "+area.getColaborador().getNome());
       
       for(Rota r : area.getRotas()){
           imprimeRota(r);
       }
   }
    
   private static void imprimeRota(Rota rota){
       System.out.println("****ROTA!");
       System.out.println("Nome: "+rota.getNome());
       System.out.println("Entregador: "+rota.getEntregador().getNome());
       
       System.out.println("Pontos de Entrega *******");       
       for(int i = 0; i < rota.getPontosEntrega().size(); i++){
         Cliente c =  rota.getPontosEntrega().get(i);
           System.out.println("Nome: "+c.getNome());
       }
       
     
   }
    
}
