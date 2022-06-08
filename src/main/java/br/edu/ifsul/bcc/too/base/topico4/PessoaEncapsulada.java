
package br.edu.ifsul.bcc.too.base.topico4;

import java.util.Calendar;

/**
 *
 * @author telmo
 */

//classe é uma especificação para um objeto. 
//Classe ou tipo, permite especificar o formato dos objetos que poderão ser criados futuramente. (variáveis do tipo da classe).
//Ou seja, classe é como se fosse um molde para objetos. 
//instância de uma classe é equivalente a objeto da classe.
public class PessoaEncapsulada {
    
    /* atributos de instância ou de objeto: definem o estado do objeto em um determinado instante.*/
    private String cpf;//atributos privados e métodos públicos é uma forma de encapsulamento.
    private String nome;
    private String corOlhos;
    private String corCabelo;
    private Calendar dataNascimento;
    private Float altura;
    
    /*
      Acessibilidade: permite implementar o encapsulamento. Ou seja, encapsular (ocultar) a complexidade (código) 
      que não é relevante para o restante da implementação e disponibilizar o que é revelante. 
    
      private: visível apenas dentro da classe.
      protected: visível apenas dentro do pacote.
      public: totalmente visível. 
    */
    
    //construtor padrão da classe: protegido e sem parâmetros.
    protected PessoaEncapsulada(){
        
        //esse método será executado na criação da instância.
    }
    
    //https://www.devmedia.com.br/sobrecarga-e-sobreposicao-de-metodos-em-orientacao-a-objetos/33066
    //polimorfismo: possibilita a reutilização de codigo fonte, uma vez que um objeto pode assumir várias formas.
    //Existem dois tipos de polimorfismo: sobrecarga (orverload) e sobreposição (override).
    
    //Sobrecarga: permite a existencia de mais de um método com o mesmo nome, porém, 
    //com assinatura diferente (quantidade e tipo de argumentos/parâmetros)
    protected PessoaEncapsulada (String cpf, String nome){
        
        this.cpf = cpf;
        this.nome = nome;
    }
    
    //Sobreposição: permite reescrever um método em uma subclasse que possua comportamento diferente
    //do método de mesma assinatura na superclasse.
    @Override
    public String toString(){
        
        return this.cpf;
    }
    
    //encapsulamento: restringe o acesso ao atributo da instância e libera o acesso vai método público.
    //dessa forma é possível controlar o que será retornado.
    public String getCPF(){        
        return this.cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
