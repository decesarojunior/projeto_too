
package br.edu.ifsul.bcc.too.base.topico3.exercicios.respostas;

import br.edu.ifsul.bcc.too.base.topico3.util.Carro;
import br.edu.ifsul.bcc.too.base.topico3.util.Pneu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.SpringLayout;

/**
 *
 * @author telmo
 */
public class Resposta7 {
    
    /*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da 
            classe Carro. 
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
    */
    
    public Resposta7(){
        
        //exercicio71();
        //exercicio72();
        exercicio73();
    }
    
    public void exercicio71(){
     

          Carro c = new Carro("Fusca", 
                              "1300L", "VW", 
                              "123abc", 7500.0f);
          Carro c1 = new Carro("Passsat", 
                               "pointer", "VW", 
                               "823abc", Float.parseFloat("9500"));
          
          Carro c2 = new Carro("Voyage", 
                               "LS", "VW", 
                               "723abc", Float.parseFloat("9900"));
          
          Carro c3 = new Carro("Santana", 
                               "LS", "VW", 
                               "523abc", Float.parseFloat("1100"));
          
          Carro c4 = new Carro("Gol", 
                               "MPI", "VW", 
                               "023abc", Float.parseFloat("12000"));
         
          Map<Integer, Carro> mapCarros = new HashMap();
          
           mapCarros.put(1, c);
           mapCarros.put(2, c1);
           mapCarros.put(3, c2);
           mapCarros.put(4, c3);
           mapCarros.put(5, c4);
                      
                   
            for (Map.Entry<Integer, Carro> m : mapCarros.entrySet()) {        
                  System.out.println("Chave "+m.getKey() + " Valor : "+ m.getValue());    
            } 
        
    }
          
    /*
    
    
        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu. 
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela dos Pneus.
    */

    public void exercicio72(){
        
        List<Pneu> lista = new ArrayList<>();
        
        Pneu p1 = new Pneu(1, "F700", 1, "165/60/R13", "Firestone" , 349.00f);
        Pneu p2 = new Pneu(2, "RP18", 1, "165/60/R13", "Westlake" , 299.00f);
        Pneu p3 = new Pneu(3, "Energy XM2+", 2, "165/60/R13", "Michelin" , 529.90f);
        Pneu p4 = new Pneu(4, "Ecopia", 2, "165/60/R13", "Bridgestone" , 439.00f);
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        Collections.sort(lista);
        
        for(Pneu p : lista)
            System.out.println("Pneu : "+p);
        
        
        
    }
    
    
    /*
    
        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. Na classe Exercicio7 crie um novo método para 
             realizar os seguintes procedimentos: criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, 
             adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.
        
    */
    
    public void exercicio73(){
        
        List<Carro> listaCarros = new ArrayList<>();
        List<Pneu> lista = new ArrayList<>();
        
        Pneu p1 = new Pneu(1, "F700", 1, "165/60/R13", "Firestone" , 349.00f);
        Pneu p2 = new Pneu(2, "RP18", 1, "165/60/R13", "Westlake" , 299.00f);
        Pneu p3 = new Pneu(3, "Energy XM2+", 2, "165/60/R13", "Michelin" , 529.90f);
        Pneu p4 = new Pneu(4, "Ecopia", 2, "165/60/R13", "Bridgestone" , 439.00f);
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        Carro c = new Carro("Fusca", 
                              "1300L", "VW", 
                              "123abc", 7500.0f, lista);
                        
        listaCarros.add(c);
        Carro c1 = new Carro("Passsat", 
                               "pointer", "VW", 
                               "823abc", Float.parseFloat("9500"), lista);
        
        listaCarros.add(c1);
        Carro c2 = new Carro("Voyage", 
                               "LS", "VW", 
                               "723abc", Float.parseFloat("9900"), lista);
                  
        listaCarros.add(c2);  
        
        for(Carro carro : listaCarros){
            
            System.out.println("Carrro: "+carro);
            for(Pneu pneu : carro.getPneus()){
                System.out.println("\t"+pneu);
                
            }
            
        }
        
    }
    
    public static void main(String args[]){
        
        new Resposta7();
    }
    
}
