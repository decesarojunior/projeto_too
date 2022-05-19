
package br.edu.ifsul.bcc.too.base.topico3.exercicios;

import br.edu.ifsul.bcc.too.base.topico3.Colecoes;
import br.edu.ifsul.bcc.too.base.topico3.util.Aluno;
import br.edu.ifsul.bcc.too.base.topico3.util.Carro;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author telmo
 */
public class Exercicio7 {
    
    
    Exercicio7(){
        
        exer71();
    }
    
    public void exer71(){
        
          /*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da 
            classe Carro. 
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
    */
            
          Carro c = new Carro("Fusca", 
                              "1300L", "VW", 
                              "123abc", 7500.0f);
          Carro c1 = new Carro("Passsat", 
                               "pointer", "VW", 
                               "923abc", Float.parseFloat("9500"));
         
          Map<Integer, Carro> mapCarros = new HashMap();
          
           mapCarros.put(1, c);
           mapCarros.put(2, c1);
           
           //System.out.println(mapCarros);
           
           System.out.println("Modelo do carro - codigo 1: " + 
                               mapCarros.get(1));
           System.out.println("Modelo do carro - codigo 2: " + 
                               mapCarros.get(2));
      }    
    
    
        
  /*
    
    
        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu. 
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela dos Pneus.
    
    
        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos:
             criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.
        
    */
    

    public static void main(String[] args) {
        
         new Exercicio7();
    }
    
}
