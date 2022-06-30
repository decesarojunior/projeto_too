
package br.edu.ifsul.bcc.too.base.topico5.exercicios.sistemabilhetes;

/**
 *
 * @author telmo
 */
public enum TipoBilheteEnum {
    
    ECONOMICA(Long.valueOf("1"), "Econômica"),
    EXECUTIVA(Long.valueOf("2"), "Executiva"),
    PRIMEIRA(Long.valueOf("3"), "Primeira");
        
    private Long id;
    private String nome;
    
    TipoBilheteEnum(Long id, String nome){
    
        this.id = id;
        this.nome = nome;                
    }
    
}
