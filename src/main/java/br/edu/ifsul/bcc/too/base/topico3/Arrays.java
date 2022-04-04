
package br.edu.ifsul.bcc.too.base.topico3;

/**
 *
 * @author telmo
 */
public class Arrays {
    
    public static void main(String[] args) {
    
    
     /*            
        Exemplos para a inicialização de vetores/arrays:
    
        Os arrays ou matrizes, como são conhecidos pelo Java, fazem parte do pacote java.util na coleção da API do Java. São objetos de recipientes que contém um número fixo de valores de um único tipo. O comprimento de um array é estabelecido quando criado, sendo que após a criação o seu comprimento fica fixo.        
    
        Cada item em um array é chamado de elemento, e cada elemento é acessado pelo número, o índice. Abaixo é mostrado se dá esse acesso aos seus elementos, lembrando que sempre sua numeração começa em 0. 
        
    */
        int[] rgiAuxiliar; //declaração de um vetor de inteiros.
        
        int[] rgiTeste = new int[4];
        
        int[] rg1Dados;
        
        rg1Dados = new int[10];
        
        int[] rgiA = new int[44], rgiB = new int[22];
        
        int[] rg1C = {1,2,3,4,5,6,7,8,9,10}; 
        
        System.out.println(rg1C.length); //retorna o tamanho do vetor.
        
        int[][] rgNumeros = { { 1,2,3 }, { 4, 5, 6 } }; // array com duas dimensoes. 3x3.
        
        /*
            Percorrendo Arrays
            A instrução for aprimorado, como é conhecida, serve para obter elementos de um array, sem a possibilidade de alterá-los. Se caso houver necessidade de modificar os elementos, isso pode ser feito com a instrução for controlada por contador
        
        */
        
        for (int ele : rg1C)
            
            System.out.println("Valor do Elemento: "+ele);
        
        
        for (int ele : rg1C)
            
            if(ele % 2 == 0)
                System.out.println("Valor do Elemento par : "+ele);
            else
                System.out.println("Valor do Elemento impar: "+ele);
        
        
        for (int linha=0; linha < rgNumeros.length; linha++){
            
            for(int coluna=0; coluna < rgNumeros[linha].length; coluna++){
                
                System.out.printf("%5d ", rgNumeros[linha][coluna]);
                
            }
            System.out.println("");
            
        }
        
    }
}
    /*
        Fontes: 
            https://www.devmedia.com.br/trabalhando-com-arrays-em-java/25530            
    */  