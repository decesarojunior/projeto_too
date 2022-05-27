
package br.edu.ifsul.bcc.too.base.topico3.util;

/**
 *
 * @author telmo
 * Essa classe deve ter os seguintes atributos: 
 *   codigo, modelo, posição, medida, fabricante e valor. 
   O construtor (público) deverá receber dados para inicializar 
   * todos esses atributos. 
   * Sobrescreva o método toString para retornar o codigo e modelo.
 */


public class Pneu implements Comparable<Pneu> {
    
    private Integer codigo;
    private String modelo;
    private Integer posicao;
    private String medida;
    private String fabricante;
    private Float valor;
    
    public Pneu(Integer codigo, String modelo, Integer posicao, String medida, String fabricante, Float valor){
        
        this.codigo = codigo;
        this.modelo = modelo;
        this.posicao = posicao;
        this.medida = medida;
        this.fabricante = fabricante;
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        
        return codigo + " - " + modelo;
    }

    @Override
    public int compareTo(Pneu t) {
        
        return modelo.compareTo(t.modelo);
    }
    
    
}
