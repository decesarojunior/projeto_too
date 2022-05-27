
package br.edu.ifsul.bcc.too.base.topico3.exercicios.respostas;

/**
 *
 * @author telmo junior
 */
public class Resposta5 {
    
    static String strDados = "A classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos. Isso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java. Aqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";
    
    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma rotina para utilizar os métodos da classe 
            java.lang.String utilizando a variável estática strDados.:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim.    
    */
    
    public Resposta5(){        
        
    }
    
    public static void main(String args[]){
        
        String ret = strDados.concat("##");
        System.out.println("Teste de concatenacao: "+ret);
        
        ret = String.valueOf(true);
        System.out.println("Teste de construcao de string: "+ret);
        
        
        System.out.println("strDados inicia com o caractere A ? :"+strDados.startsWith("A"));
        
        System.out.println("strDados finaliza com o caractere . ? :"+strDados.endsWith("."));
        
        System.out.println("indice do caracter é em strDados :"+strDados.indexOf("é"));
        
        System.out.println("substring do indice 16 em diante em strDados : "+strDados.substring(16));
        
        System.out.println("replate de é por É em strDados : "+strDados.replace("é","É"));
        
        System.out.println("remoção de caracteres em branco antes e depois em strDados : "+strDados.trim());
        
    }
    
}
