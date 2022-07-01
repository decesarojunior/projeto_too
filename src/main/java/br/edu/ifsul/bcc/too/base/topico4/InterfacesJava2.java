
package br.edu.ifsul.bcc.too.base.topico4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telmo
 */
public class InterfacesJava2 implements ExemploInterface {
    
    InterfacesJava2(){
        
        List<ExemploInterface> lista = new ArrayList();
        
        lista.add(this);
        
         InterfacesJava2 obj = new  InterfacesJava2(); 
          lista.add(obj);
           
          InterfacesJava obj1 = new  InterfacesJava();
           lista.add(obj1);
           
           
         //tipo ExemploInterface e instancia da classe que implementa a interface
         ExemploInterface ei2 = new InterfacesJava2();
         
         
         lista.add(ei2);
         
         //tipo ExemploInterface e instancia da classe que implementa a interface
         ExemploInterface ei1 = new InterfacesJava();
         
         lista.add(ei1);
         
         //não é possivel instanciar uma interface
         //ExemploInterface teste = new  ExemploInterface();
         
    }
    
    
    public static void main(String args[]){
        
        new InterfacesJava();
        
    }

    @Override
    public String getDataAtual() {
        
        //recuperar a data a partir do tipo java.util.Date
        java.util.Date dt = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(dt);
        
    
    }

    @Override
    public int getAnoAtual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
