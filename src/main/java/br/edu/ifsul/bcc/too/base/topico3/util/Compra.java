
package br.edu.ifsul.bcc.too.base.topico3.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author telmo
 * https://www.devmedia.com.br/orientacao-a-objetos-simples-assim/3254
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

    /**
     * @return the data_emissao
     */
    public Calendar getData_emissao() {
        return data_emissao;
    }

    /**
     * @return the data_saida
     */
    public Date getData_saida() {
        return data_saida;
    }
    
    @Override
    public String toString(){
        
        if(data_emissao != null && data_saida != null){
            
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS");            
            
            return "Codigo: "+codigo+ " Emissao: "+f.format(data_emissao.getTime()) + " Saída: "+f.format(data_saida);
        }
            
        return super.toString();
    }
    
    
    
}
