/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.base.topico5.sistemabilhetes;

/**
 *
 * @author telmo
 */
public abstract class Bilhete {
    
    private Long id;
    private Integer numero;
    private String assento;
    private SituacaoBilheteEnum situacao;
    
    public void reservar(Passageiro passageiro){
        
    }
    
}
