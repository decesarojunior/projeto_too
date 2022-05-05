
package br.edu.ifsul.bcc.too.base.topico3.util;

/**
 *
 * @author telmo
 */
public class Aluno implements Comparable<Aluno> {
    
    private String matricula;
    private String nome;
    
    //construtor protegido - somente acessível dentro do pacote.
    Aluno(){
        
    }
    
    public Aluno(String matricula, String nome){
        
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno t) {

        return this.matricula.compareTo(t.matricula);
    }
    
    @Override
    public String toString(){
        
        return nome+" - "+matricula;
    }
    
}
