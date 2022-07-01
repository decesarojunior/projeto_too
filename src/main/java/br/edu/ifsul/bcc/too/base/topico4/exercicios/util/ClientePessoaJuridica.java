
package br.edu.ifsul.bcc.too.base.topico4.exercicios.util;

/**
 *
 * @author telmo
 */
public class ClientePessoaJuridica extends Cliente {
    
    private String cnpj;
    
    
    public ClientePessoaJuridica(){
        
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
