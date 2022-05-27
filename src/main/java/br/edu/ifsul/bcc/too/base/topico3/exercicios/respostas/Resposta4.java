
package br.edu.ifsul.bcc.too.base.topico3.exercicios.respostas;

/**
 *
 * @author telmo
 */
public class Resposta4 {
    
      /*
      4) Teste e recupere duas informações recebidas por parâmetro no método main. Para isso execute a main informando dois valores. 
         Caso os valores sejam inteiros positivos. Calcule a média e imprima na tela o resultado. Caso contrário, informe e finalize o programa.
             
        Comando para compilação (a partir do diretorio java): javac br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4.java
    
        Comando para execução (a partir do diretorio java): java br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4
     */
    public Resposta4() {

    }

    public static void main(String[] args) {

        if (args.length ==  2) {
            
            try{
                
                Float f1 = Float.parseFloat(args[0]);
                Float f2 = Float.parseFloat(args[1]);
                
                Float media = (f1 + f2) / 2.0f;
                
                System.out.println("Media: "+media);
                
                
            }catch(NumberFormatException e){
                
                System.out.println("Formato do parametros é invalido : "+args[0]+ "  e  "+args[1]);
                e.printStackTrace();
                
            }
                        
            
        } else {
            System.out.println("Não recebeu Parametros/argumentos na inicializacao...");
        }

    }
    
}
