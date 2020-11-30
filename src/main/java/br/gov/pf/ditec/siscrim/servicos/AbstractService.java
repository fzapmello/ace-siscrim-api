package br.gov.pf.ditec.siscrim.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbstractService {

    @Autowired
    public WebClientService webClientService;

}
