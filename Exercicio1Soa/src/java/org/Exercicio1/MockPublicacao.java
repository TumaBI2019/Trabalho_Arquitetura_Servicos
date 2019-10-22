/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.trabalho1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class MockPublicacao {
    private List<Publicacao> publicacoes;

    public MockPublicacao() {
        this.publicacoes = new ArrayList<Publicacao>() {};
        
        this.publicacoes.add(new Publicacao (1,
                                  "A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring",
                                  0, 0, 2019));
        this.publicacoes.add(new Publicacao (2,
                                  "ResearchOps: The case for DevOps in scientific applications",
                                  1398, 1404, 2019));
        this.publicacoes.add(new Publicacao (3,
                                  "Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study",
                                  1441, 1448, 2019));
        this.publicacoes.add(new Publicacao (4,
                                  "WISE SPL: Bringing Multi-tenancy to the Weather Insights Environment System",
                                  0, 0, 2019));
        this.publicacoes.add(new Publicacao (5,
                                  "Automating the identification of opportunities for business process improvement patterns application",
                                  252, 273, 2017));
        this.publicacoes.add(new Publicacao (6,
                                  "IntelliGOV - A Semantic Approach for Compliance Validation of Service-Oriented Architectures",
                                  0, 0, 2016));
        this.publicacoes.add(new Publicacao (7,
                                  "BPMN2TEXT: A Language-Independent Framework to Generate Natural Language Text from BPMN models",
                                  38, 56, 2016));
        this.publicacoes.add(new Publicacao (8,
                                  "Governance of Service-Oriented Architecture through the CommonGov Approach.",
                                  505, 514, 2017));
        this.publicacoes.add(new Publicacao (9,
                                  "Controle de Acesso a Dados com Propagação de Identidade em Aplicações Web baseadas em Serviços",
                                  48, 65, 2012));
        this.publicacoes.add(new Publicacao (10,
                                  "A Business Model for Managing SOA Initiatives",
                                  4, 33, 2011));
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
      
}
