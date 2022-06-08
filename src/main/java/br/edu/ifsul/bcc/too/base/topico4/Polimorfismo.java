
package br.edu.ifsul.bcc.too.base.topico4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Polimorfismo {
    
    private List<PessoaEncapsulada>  list = new ArrayList();
    
    protected Polimorfismo(){
        
        testOO();
        
    }
    
    private void testOO(){
        
        PessoaEncapsulada p1 = new PessoaEncapsulada();
        p1.setCPF("00001359070");
        p1.setNome("Fulano de Tal");
        
        list.add(p1);
        
        p1 = new PessoaEncapsulada();
        p1.setCPF("00001359077");
        p1.setNome("Siglano de Tal");

        
        list.add(p1);
        
        for(PessoaEncapsulada p : list){
            
            System.out.println(p);
        }
        
    }
    
    public static void main(String args[]){
        
        new Polimorfismo();
    }
    
}
