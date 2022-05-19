
package br.edu.ifsul.bcc.too.base.topico3.util;

/**
 *
 * @author telmo
 */
public class Carro {
    
    private String nome;
    private String modelo;
    private String fabricante;
    private String numero_chassi;
    private Float valor;
    
    public Carro(String nome, String modelo, String fabricante, String numero_chassi, Float valor){
            this.nome = nome;
            this.modelo = modelo;
        
    }
    
    @Override
    public String toString(){
    
        return this.modelo;
    }
    
}
