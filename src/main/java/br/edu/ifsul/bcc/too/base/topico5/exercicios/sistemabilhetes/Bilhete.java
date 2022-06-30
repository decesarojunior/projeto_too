
package br.edu.ifsul.bcc.too.base.topico5.exercicios.sistemabilhetes;

/**
 *
 * @author telmo
 */
public abstract class Bilhete {
    
    private Long id;
    private Integer numero;
    private String assento;
    
    //O estado Disponível representa que o bilhete ainda não foi reservado ou adquirido por algum passageiro.
    private SituacaoBilheteEnum situacao = SituacaoBilheteEnum.DISPONIVEL;
    
    private TipoBilheteEnum tipo;
    
    private Passageiro passageiro;
    
    private Horario horario;
    
    public void reservar(Passageiro passageiro) {
        
    }
    
    protected abstract Integer maximoBagagens(); 

    /**
     * @return the horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
    
}
