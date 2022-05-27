
package br.edu.ifsul.bcc.too.base.topico3.exercicios.respostas;

import javax.swing.JOptionPane;

/**
 *
 * @author telmo
 */
public class Resposta3 {
    
    public static void main(String[] args) {

        int[][] rgDados1 = new int[2][3];//linha e coluna - se a quantidade de coluna da primeira

        int[][] rgDados2 = new int[3][2];//for igual a quantida de linha da segunda.

        int[][] rgDados3 = new int[2][2];

        /*
            1) Com base nos métodos da classe JOptionPane obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para multiplicar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. Por fim imprima no console os dados gerados (rgDados3).

               Documentação: https://www.devmedia.com.br/introducao-a-interface-gui-no-java/25646
                             https://brasilescola.uol.com.br/matematica/multiplicacao-matrizes.htm
        */
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                boolean convertido = true;
                do{
                    try{
                        
                        String d = JOptionPane.showInputDialog(null, "Informe um valor inteiro para a posicao ["+linha+"]["+coluna+"] na M1::", "Informe", JOptionPane.PLAIN_MESSAGE);
                                
                        rgDados1[linha][coluna] = Integer.parseInt(d);
                        
                        convertido = true;
                        
                    }catch(Exception e){
                        convertido = false;
                        e.printStackTrace();
                    }
                    
                }while(convertido == false);                
                                                                
            }                        
        } 
        
                
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                
                boolean convertido = true;
                do{
                    try{
                        
                        String d = JOptionPane.showInputDialog(null, "Informe um valor inteiro para a posicao ["+linha+"]["+coluna+"] na M2:", "Informe", JOptionPane.PLAIN_MESSAGE);
                                
                        rgDados2[linha][coluna] = Integer.parseInt(d);
                        
                        convertido = true;
                        
                    }catch(Exception e){
                        convertido = false;
                        e.printStackTrace();
                    }
                    
                }while(convertido == false);                
                
                
                                
            }                        
        }
        
        int somatorio = 0;        
        for(int linha=0; linha < rgDados3.length; linha++){                                
                
                for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                    
                    somatorio = 0;
                    for(int c=0; c < rgDados2.length; c++){
                        
                        //System.out.println(rgDados1[linha][c] + " * " + rgDados2[c][coluna]);
                        somatorio += rgDados1[linha][c] * rgDados2[c][coluna];
                        
                    }                                                             
                    //System.out.println("somatorio: "+somatorio);
                    rgDados3[linha][coluna] = somatorio;
                    

                }
                //break;
                
        }
        
        
        for(int l=0; l < rgDados3.length; l++){

                for(int c=0; c < rgDados3[l].length; c++){
                    
                    System.out.print(rgDados3[l][c]+" ");
                
                }
                
                System.out.println("\t");
                
        }

    }
    
}
