
package org.trabalho1;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Trabalho1SoaWS", targetNamespace = "http://trabalho1.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Trabalho1SoaWS {


    /**
     * 
     * @param titulo
     * @return
     *     returns java.util.List<org.trabalho1.Publicacao>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaPublicacaoPorTitulo", targetNamespace = "http://trabalho1.org/", className = "org.trabalho1.BuscaPublicacaoPorTitulo")
    @ResponseWrapper(localName = "buscaPublicacaoPorTituloResponse", targetNamespace = "http://trabalho1.org/", className = "org.trabalho1.BuscaPublicacaoPorTituloResponse")
    @Action(input = "http://trabalho1.org/Trabalho1SoaWS/buscaPublicacaoPorTituloRequest", output = "http://trabalho1.org/Trabalho1SoaWS/buscaPublicacaoPorTituloResponse")
    public List<Publicacao> buscaPublicacaoPorTitulo(
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo);

    /**
     * 
     * @param ano
     * @return
     *     returns java.util.List<org.trabalho1.Publicacao>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaPublicacaoPorAno", targetNamespace = "http://trabalho1.org/", className = "org.trabalho1.BuscaPublicacaoPorAno")
    @ResponseWrapper(localName = "buscaPublicacaoPorAnoResponse", targetNamespace = "http://trabalho1.org/", className = "org.trabalho1.BuscaPublicacaoPorAnoResponse")
    @Action(input = "http://trabalho1.org/Trabalho1SoaWS/buscaPublicacaoPorAnoRequest", output = "http://trabalho1.org/Trabalho1SoaWS/buscaPublicacaoPorAnoResponse")
    public List<Publicacao> buscaPublicacaoPorAno(
        @WebParam(name = "ano", targetNamespace = "")
        int ano);

}
