
package org.trabalho1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.trabalho1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscaPublicacaoPorAno_QNAME = new QName("http://trabalho1.org/", "buscaPublicacaoPorAno");
    private final static QName _BuscaPublicacaoPorTitulo_QNAME = new QName("http://trabalho1.org/", "buscaPublicacaoPorTitulo");
    private final static QName _BuscaPublicacaoPorAnoResponse_QNAME = new QName("http://trabalho1.org/", "buscaPublicacaoPorAnoResponse");
    private final static QName _BuscaPublicacaoPorTituloResponse_QNAME = new QName("http://trabalho1.org/", "buscaPublicacaoPorTituloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.trabalho1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscaPublicacaoPorAno }
     * 
     */
    public BuscaPublicacaoPorAno createBuscaPublicacaoPorAno() {
        return new BuscaPublicacaoPorAno();
    }

    /**
     * Create an instance of {@link BuscaPublicacaoPorTitulo }
     * 
     */
    public BuscaPublicacaoPorTitulo createBuscaPublicacaoPorTitulo() {
        return new BuscaPublicacaoPorTitulo();
    }

    /**
     * Create an instance of {@link BuscaPublicacaoPorAnoResponse }
     * 
     */
    public BuscaPublicacaoPorAnoResponse createBuscaPublicacaoPorAnoResponse() {
        return new BuscaPublicacaoPorAnoResponse();
    }

    /**
     * Create an instance of {@link BuscaPublicacaoPorTituloResponse }
     * 
     */
    public BuscaPublicacaoPorTituloResponse createBuscaPublicacaoPorTituloResponse() {
        return new BuscaPublicacaoPorTituloResponse();
    }

    /**
     * Create an instance of {@link Publicacao }
     * 
     */
    public Publicacao createPublicacao() {
        return new Publicacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPublicacaoPorAno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trabalho1.org/", name = "buscaPublicacaoPorAno")
    public JAXBElement<BuscaPublicacaoPorAno> createBuscaPublicacaoPorAno(BuscaPublicacaoPorAno value) {
        return new JAXBElement<BuscaPublicacaoPorAno>(_BuscaPublicacaoPorAno_QNAME, BuscaPublicacaoPorAno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPublicacaoPorTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trabalho1.org/", name = "buscaPublicacaoPorTitulo")
    public JAXBElement<BuscaPublicacaoPorTitulo> createBuscaPublicacaoPorTitulo(BuscaPublicacaoPorTitulo value) {
        return new JAXBElement<BuscaPublicacaoPorTitulo>(_BuscaPublicacaoPorTitulo_QNAME, BuscaPublicacaoPorTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPublicacaoPorAnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trabalho1.org/", name = "buscaPublicacaoPorAnoResponse")
    public JAXBElement<BuscaPublicacaoPorAnoResponse> createBuscaPublicacaoPorAnoResponse(BuscaPublicacaoPorAnoResponse value) {
        return new JAXBElement<BuscaPublicacaoPorAnoResponse>(_BuscaPublicacaoPorAnoResponse_QNAME, BuscaPublicacaoPorAnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaPublicacaoPorTituloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trabalho1.org/", name = "buscaPublicacaoPorTituloResponse")
    public JAXBElement<BuscaPublicacaoPorTituloResponse> createBuscaPublicacaoPorTituloResponse(BuscaPublicacaoPorTituloResponse value) {
        return new JAXBElement<BuscaPublicacaoPorTituloResponse>(_BuscaPublicacaoPorTituloResponse_QNAME, BuscaPublicacaoPorTituloResponse.class, null, value);
    }

}
