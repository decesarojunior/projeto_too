
package br.edu.ifsul.bcc.too.base.topico3.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author telmo
 */
public class Compra {
    
    private Integer codigo;
    private Calendar data_emissao;
    private Date data_saida;
    private Pessoa pessoa;
    private Carro carro;
    
    //construtor público com parâmetros.
    public Compra(Integer codigo, Calendar data_emissao, Date data_saida, Pessoa pessoa, Carro carro){
    
        this.codigo = codigo;
        this.data_emissao = data_emissao;
        this.data_saida = data_saida;
        this.pessoa = pessoa;
        this.carro = carro; 
        
    }
    
    public Compra(Integer codigo, Calendar data_emissao, Date data_saida){
    
        this.codigo = codigo;
        this.data_emissao = data_emissao;
        this.data_saida = data_saida;
        
    }
    
}
