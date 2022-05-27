
package br.edu.ifsul.bcc.too.base.topico3.util;

import java.util.List;

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
    private List<Pneu> pneus;
    
    public Carro(String nome, String modelo, String fabricante, String numero_chassi, Float valor){
            this.nome = nome;
            this.modelo = modelo;
        
    }
    
    public Carro(String nome, String modelo, String fabricante, String numero_chassi, Float valor, List<Pneu> pneus){
            this.nome = nome;
            this.modelo = modelo;
            this.pneus = pneus;        
    }
    
    @Override
    public String toString(){
    
        return this.modelo;
    }
    
    
    public List<Pneu> getPneus(){
        
        return pneus;
    }
    
}
