
package br.edu.ifsul.bcc.too.base.topico3.exercicios.respostas;

import java.util.Scanner;

/**
 *
 * @author telmo
 */
public class Resposta1 {
    
      public static void main(String[] args) {
        
        int[][] rgDados1 = new int[3][3];
    
        int[][] rgDados2 = new int[3][3];
        
        int[][] rgDados3 = new int[3][3];
        
        /*
            1) Com base no método hasNext da classe Scanner obtenha informações do console e 
               inicialize as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para somar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. Por fim imprima no console os dados gerados (rgDados3).
        
               Documentação: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        */
        
        Scanner sc = new Scanner(System.in);
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                System.out.println("Digite um valor para a posicao ["+linha+"]["+coluna+"] na M1:");
                if(sc.hasNext()){
                    rgDados1[linha][coluna] = Integer.parseInt(sc.next());
                }
                System.out.println("Digite um valor para a posicao ["+linha+"]["+coluna+"] na M2:");
                if(sc.hasNext()){
                    rgDados2[linha][coluna] = Integer.parseInt(sc.next());
                }
                rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna];
            }                        
        }
            
        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                
                System.out.print(rgDados3[linha][coluna]+" ");
            
            }
            System.out.println("\n");
        }
      
      }
    
}
