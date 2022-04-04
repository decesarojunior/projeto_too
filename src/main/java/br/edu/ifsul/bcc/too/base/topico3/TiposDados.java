/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.base.topico3;

/**
 *
 * @author telmo
 */
public class TiposDados {
    
    public static void main(String[] args) {
        

        /*
            Tipos de Dados:

            O Java possui dois tipos de dados que são divididos em por valor (tipos primitivos) e por referência 
            (tipos por referência). 

            Tipos primitivos: os tipos primitivos na linguagem Java são boolean, byte, char, short, int, long, float e double. 
            Uma variável do tipo primitivo pode armazenar exatamente um valor de seu tipo declarado por vez, quando outro 
            valor for atribuído a essa variável, seu valor inicial será substituído. As variáveis de instância de tipo primitivo 
            são inicializadas por padrão, as variáveis dos tipos byte, char, short, int, long, float e double são inicializadas como 0, 
            e as variáveis do tipo boolean são inicializadas como false.

            Tipos por referência: Os tipos por referência, são classes que especificam os tipos de objeto Strings, Arrays Primitivos e 
            Objetos. Os programas utilizam as variáveis de tipos por referência para armazenar as localizações de objetos na memória 
            do computador. Para trazer em um objeto os seus métodos de instância, é preciso ter referência a algum objeto. 
            As variáveis de referência são inicializadas com o valor “null” (nulo). 

            Operador new: a palavra chave new solicita a memória do sistema para armazenar um objeto e inicializa o objeto. 
           Deve ser utiliza para inicializar variavéis do tipo por referência.

            Exemplos:

        */

        String strTime = new String("Internacional");//o operador new sempre cria uma nova instância/alocação de espaço para o objeto.

        String strAuxiliar = "Internacional";

        if(strTime == strAuxiliar){

            System.out.println("Instâncias iguais");
        }

        if(strTime.equals(strAuxiliar)){

            System.out.println("conteúdos iguais");
        }        
        
    }
    
    

}    /*
        Fontes:             
            https://www.devmedia.com.br/tipos-de-dados-por-valor-e-por-referencia-em-java/25293            
    */  
