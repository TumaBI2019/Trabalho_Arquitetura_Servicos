/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.trabalho1;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Douglas
 */
@WebService(serviceName = "Trabalho1SoaWS")
public class Trabalho1SoaWS {

    /**
     * Operação de Web service
     * @param titulo
     * @return 
     */
    @WebMethod(operationName = "buscaPublicacaoPorTitulo")
    public ArrayList<Publicacao> buscaPublicacaoPorTitulo(@WebParam(name = "titulo") String titulo) {
        //TODO write your implementation code here:
        MockPublicacao mockLista = new MockPublicacao();
        
        ArrayList<Publicacao> resultado = new ArrayList<>();
        titulo = titulo.toLowerCase();
        
        for(Publicacao publicacao : mockLista.getPublicacoes() ) {
            if (publicacao.getTitulo().toLowerCase().contains(titulo))
                resultado.add(publicacao);
        }
        return resultado;
    }

    /**
     * Operação de Web service
     * @param ano
     * @return 
     */
    @WebMethod(operationName = "buscaPublicacaoPorAno")
    public ArrayList<Publicacao> buscaPublicacaoPorAno(@WebParam(name = "ano") int ano) {
        //TODO write your implementation code here:
        MockPublicacao mockLista = new MockPublicacao();
        
        ArrayList<Publicacao> resultado = new ArrayList<>();
               
        for(Publicacao publicacao : mockLista.getPublicacoes() ) {
            if (publicacao.getAnoPublicacao() == ano)
                resultado.add(publicacao);
        }
        return resultado;
    }
    
    
}
