
package br.edu.ifsul.bcc.too.base.topico3.exercicios.respostas;

/**
 *
 * @author telmo
 */
public class Resposta6 {
    
    /*
        6) Implemente uma rotina para demonstrar/testar os modificadores static e FINAL.
    
            Documentação:  https://www.devmedia.com.br/modificadores-de-acesso-do-java/27065
    */
    
    final String dados = "123abc";
    
    public Resposta6(){
        
        //não é possivel alterar uma variavel com o modificador final.
        //dados = dados + "."; 
    }
    
    public static void main(String args[]){
        
        System.out.println("Acessando a variavel strDados da classe Resposta5 sem a criaçao de um objeto da classe : "+ Resposta5.strDados);
        
        new Resposta6();
        
        
    }
    
    
    
    
}
