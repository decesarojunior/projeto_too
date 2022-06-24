
package br.edu.ifsul.bcc.too.base.topico4;

/**
 *
 * @author telmo
 */
public class EnumJava {
    
    /*    
        Fonte: https://www.devmedia.com.br/enums-no-java/38764     
    
        Em Java, uma enum é um tipo no qual declaramos um conjunto de valores constantes pré-definidos. 
        Sua sintaxe é muito semelhante à declaração de uma classe, exceto pelo uso da palavra chave enum 
        que antecede seu nome. 
    
    */
    
    EnumJava(){
        
        System.out.println("Enum - ATIVO: "+ExemploEnum.ATIVO);
        System.out.println("Enum - Inativo: "+ExemploEnum.ATIVO);
        
        ExemploEnum status = ExemploEnum.ATIVO;
        
        System.out.println("status: "+status);
        
        
        
        
    }
    
    
    public static void main(String args[]){
        
        new EnumJava();
    }
    
}