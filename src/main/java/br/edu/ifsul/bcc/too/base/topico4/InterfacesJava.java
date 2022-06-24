
package br.edu.ifsul.bcc.too.base.topico4;

import com.sun.jdi.InterfaceType;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class InterfacesJava implements ExemploInterface{
    
    InterfacesJava(){
        
        System.out.println("DAta atual: "+getDataAtual());
    }

    @Override
    public String getDataAtual() {
                
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(c.getTime());
        
    }
    
    
    //https://www.devmedia.com.br/interfaces-programacao-orientada-a-objetos/18695
    
    /*
    Podemos definir como interface o contrato entre a classe e o mundo exterior. 
    Quando uma classe implementa uma interface, se compromete a fornecer o comportamento publicado por esta interface.
    
    As classes ajudam a definir um objeto e seu comportamento e as interfaces que auxiliam na definição dessas classes. 
    As interfaces são formadas pela declaração de um ou mais métodos, os quais obrigatoriamente não possuem corpo.
    
    As operações específicas para cada um desses métodos são realizadas pela classe que implementa. De um modo geral, 
    podemos dizer que as interfaces definem certas funcionalidades, as quais dependem das classes que implementam as interfaces 
    para que os métodos existam.    
    */
    
    
    public static void main(String args[]){
        
        new InterfacesJava();
        
    }
    
    
}
