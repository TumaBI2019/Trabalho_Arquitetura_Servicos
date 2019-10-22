/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1cliente;

import java.util.List;
import org.trabalho1.Publicacao;

/**
 *
 * @author Douglas
 */
public class exercicio1cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        List<Publicacao> response;
        
        response = buscaPublicacaoPorTitulo("APP");
        System.out.println ("Filtro 1(por título): ");
        imprimeResultado(response);
        
        response = buscaPublicacaoPorAno(2014);        
        System.out.println ("Filtro 2(por ano): ");
        imprimeResultado(response);
    }

    private static java.util.List<org.trabalho1.Publicacao> buscaPublicacaoPorTitulo(java.lang.String titulo) {
        org.trabalho1.Trabalho1SoaWS_Service service = new org.trabalho1.Trabalho1SoaWS_Service();
        org.trabalho1.Trabalho1SoaWS port = service.getTrabalho1SoaWSPort();
        return port.buscaPublicacaoPorTitulo(titulo);
    }

    private static java.util.List<org.trabalho1.Publicacao> buscaPublicacaoPorAno(int ano) {
        org.trabalho1.Trabalho1SoaWS_Service service = new org.trabalho1.Trabalho1SoaWS_Service();
        org.trabalho1.Trabalho1SoaWS port = service.getTrabalho1SoaWSPort();
        return port.buscaPublicacaoPorAno(ano);
    }
    
    public static void imprimeResultado (List<Publicacao> response){
        PublicacaoCliente publicacao = new PublicacaoCliente();
        for(Publicacao itemResponse : response) {
            publicacao.setId(itemResponse.getId());
            publicacao.setTitulo(itemResponse.getTitulo());
            publicacao.setPaginaInicial(itemResponse.getPaginaInicial());
            publicacao.setPaginaFinal(itemResponse.getPaginaFinal());
            publicacao.setAnoPublicacao(itemResponse.getAnoPublicacao());
            
            publicacao.imprimePublicacao();
        }
        if (response.isEmpty())
            System.out.println ("Não há publicações para a sua pesquisa");
    }
    
}
