
package br.edu.ifsul.bcc.too.base.topico5.exercicios.sistemabilhetes;

/**
 *
 * @author telmo
 */
public enum SituacaoBilheteEnum {
    
    DISPONIVEL(Long.valueOf("1"), "Disponível"),
    RESERVADO(Long.valueOf("2"), "Reservado"),
    VENDIDO(Long.valueOf("3"), "Vendido");
        
    private Long id;
    private String nome;
    
    SituacaoBilheteEnum(Long id, String nome){
    
        this.id = id;
        this.nome = nome;                
    }
    
    public String getNome(){
        
        return this.nome;
    }
    
}
