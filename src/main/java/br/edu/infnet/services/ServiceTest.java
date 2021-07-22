package br.edu.infnet.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    private Logger LOG = (Logger) LoggerFactory.getLogger(ServiceTest.class);

    public void execute() {
        LOG.info("Executando o ServiceTest... Agora!");

    }
}
