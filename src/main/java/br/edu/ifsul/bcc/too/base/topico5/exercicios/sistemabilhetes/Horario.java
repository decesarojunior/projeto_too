
package br.edu.ifsul.bcc.too.base.topico5.exercicios.sistemabilhetes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Horario {
    
    private Long id;
    private String codigo;
    private Date partida;
    private Date chegada;
    private Integer qtdEconomica;
    private Integer qtdPrimeira;
    private Integer qtdExecutiva;
    
    private Aviao aviao;
    private Rota rota;
        
    private List<Bilhete> bilhetesEconomica;
    private List<Bilhete> bilhetesPrimeira;
    private List<Bilhete> bilhetesExecutiva;

    /**
     * @return the qtdEconomica
     */
    public Integer getQtdEconomica() {
        return qtdEconomica;
    }

    /**
     * @param qtdEconomica the qtdEconomica to set
     */
    public void setQtdEconomica(Integer qtdEconomica) {
        this.qtdEconomica = qtdEconomica;
    }


    /*
     Por fim, um último aspecto relacionado ao horário é que ao criar um, 
     este deverá gerar os bilhetes correspondentes para cada classe, a partir da quantidade 
     informada no momento do cadastro do bilhete.
    */

    public void setAviao(Aviao aviao) {
        
        this.aviao = aviao;
        this.qtdEconomica = 0;
        this.qtdExecutiva = 0;
        this.qtdPrimeira = 0;
        
        this.bilhetesEconomica = new ArrayList();
        for(int i=0; i < this.aviao.getQtdEconomica(); i++){
        
            Economica e = new Economica();
            
            this.bilhetesEconomica.add(e);            
        }
        
        
        //demais classes....
    }
            
    
    
    
}
