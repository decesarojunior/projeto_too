
package br.edu.ifsul.bcc.too.base.topico3;

/**
 *
 * @author telmo
 */

public class ManipulacaoStrings {
        
    public static void main(String[] args) {
        
        /*
            Uma String armazena uma sequência de caracteres. Apesar de ser fácil de utilizar, essa classe possui diversas 
            características que podem não ser óbvias para quem está tendo o seu primeiro contato com ela.
        
            Por exemplo, um objeto String é imutável, o que significa que o texto que ele carrega nunca é alterado. 
            Sempre que um texto precisa ser modificado é utilizado mais espaço em memória para que uma nova String seja 
            criada contendo a nova versão dele. Essas características serão o assunto que abordaremos primeiro.
        
        */
        
        String texto = "Qualquer texto entre aspas é uma String";
        
        String texto2 = new String("Qualquer texto entre aspas é uma String");
        
        "Qualquer texto entre aspas é uma String".length();
        
        String txt;
        
        //Testando igualdade entre Strings
        
        //comando: ==, equals, equalsIgnoreCase, compareTo, compareToIgnoreCase
        
        //Principais métodos da classe String: concat, String.valueOf, Length, startsWith endsWith, indexOf, substring, replace, trim
    }
    
    
}


    /*
        Fontes: 
            
            https://www.devmedia.com.br/string-em-java-entendendo-e-utilizando-essa-classe/25503
            
    */  