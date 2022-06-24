
package br.edu.ifsul.bcc.too.base.topico5.sistemabilhetes;

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
            
    
}
