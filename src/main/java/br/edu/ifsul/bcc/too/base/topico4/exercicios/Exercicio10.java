
package br.edu.ifsul.bcc.too.base.topico4.exercicios;

import br.edu.ifsul.bcc.too.base.topico4.exercicios.util.Cliente;
import br.edu.ifsul.bcc.too.base.topico4.exercicios.util.ClientePessoaFisica;
import br.edu.ifsul.bcc.too.base.topico4.exercicios.util.ClientePessoaJuridica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Exercicio10 {
    
    
    /*
        10. Implemente no pacote br.edu.ifsul.bcc.too.base.topico4.exercicios.util o diagrama localizado no diretorio
        src/main/resources/imagens/diagrama_heranca_cliente.jpg. Sendo assim, crie as classes: Cliente, ClientePessoaFisica e ClientePessoaJuridica.
        Na classe Cliente defina os atributos protegidos: endereco, bairro, telefone, ultimaCompra.
        Na classe ClientePessoaFisica defina os atributos privados: cpf, nome e nascimento.
        Por fim, na classe ClientePessoaJuridica defina os atributos privados: cnpj, nomeFantasia e razaoSocial.
    
    */
    
    /*
        10.1 Implemente a herança conforme o diagrama. Portanto, ClientePessoaFisica deverá herdar de Cliente. Ex:
                ...
                    public class ClientePessoaFisica extends Cliente {
                ... 
    
            ClientePessoaJuridica também deverá herdar de Cliente, ex: 
                ...
                    public class ClientePessoaJuridica extends Cliente {
    */
    
    /*
    
        10.2 Encapsule os atributos das classes Cliente, ClientePessoaFisica e ClientePessoaJuridica
    */
    
    /*
        10.3 Codifique e execute um método na classe Exercicio10 para criar duas instâncias de ClientePessoaFisica e duas de ClientePessoaJuridica.
             Essas 4 instâncias deverão conter dados e ser adicionadas em uma lista de Cliente. Em seguida imprime-as na saída padrão os seus dados e a indicação do tipo da instância. ex:
                
                - Nome         : Fulano     (Pessoa Fisica)
                - Nome fantasia: Bar do Zé (Pessoa Juridica)
    
    */
    
    Exercicio10(){
        
        List<Cliente> lista = new ArrayList<>();
        
        ClientePessoaFisica pf = new ClientePessoaFisica();
        pf.endereco = "";
        pf.setCpf("123456");
        lista.add(pf);
        
        ClientePessoaJuridica pj = new ClientePessoaJuridica();
        pj.endereco = "";
        pj.setCnpj("582789");
        lista.add(pj);
        
        for(Cliente c : lista){
            if(c instanceof ClientePessoaFisica){
                
                System.out.println("Cliente Física: "+ c);
                //casting -  modelagem de tipos.
                ClientePessoaFisica p =  (ClientePessoaFisica)  c;
                //imprimir o cpf do Cliente pessoa fisica
                p.getCpf();
                
            }else if (c instanceof  ClientePessoaJuridica){
                
                System.out.println("Cliente Juridica: "+ c);
                ClientePessoaJuridica j =   (ClientePessoaJuridica)   c;
                //imprimir o cpf do Cliente pessoa fisica
                
                j.getCnpj();
            }
        }
        
    }
    
    public static void main(String args[]){
        
        
        new Exercicio10();
    }
            
}
