
package br.edu.ifsul.bcc.too.base.topico4.exercicios.respostas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Exercicio9 {
    
    public Exercicio9(){
        
        List<Pessoa> lista = new ArrayList();
        
        Pessoa p = new Pessoa();
        p.setCPF("00001002255");
        lista.add(p);
        
        
        p = new Pessoa("", "", "", "", Calendar.getInstance(), 173f);                
        lista.add(p);
        
        for(Pessoa pess : lista){
            
            System.out.println(pess);
        }
        
        
        
    }
    
    public static void main(String args[]){
        new Exercicio9();
    }
    
}
