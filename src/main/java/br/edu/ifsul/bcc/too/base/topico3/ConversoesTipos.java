package br.edu.ifsul.bcc.too.base.topico3;

/**
 *
 * @author telmo
 */
public class ConversoesTipos {
    
    
    public static void main(String[] args) {
        
        /* Conversões de tipos */
        
        String strValor1 = "123";
        
        String strValor2 = "123a";
        
        String strValor3 = "10.5";
        
        Integer iValor = Integer.parseInt(strValor1);
        
        iValor = Integer.parseInt(strValor2);
        
        iValor = Integer.valueOf(strValor1);                
        
        Float fValor = Float.parseFloat(strValor3);
        
        String strTeste = fValor.toString();
        
        System.out.println(iValor);
        
    }
    
}


    /*
        Fontes: 
            https://www.devmedia.com.br/conversoes-em-java/2695            
    */