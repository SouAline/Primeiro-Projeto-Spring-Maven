package br.edu.infnet;

import br.edu.infnet.services.ServiceTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class HelloSpringWorldApplication implements CommandLineRunner {

	@Autowired
	private ServiceTest serviceTest;
	@Autowired
	private ApplicationContext applicationContext;

	private Logger LOG = (Logger) LoggerFactory.getLogger(HelloSpringWorldApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Hello Spring World!!");
		serviceTest.execute();
		String[] beans = applicationContext.getBeanDefinitionNames();
		Arrays.sort(beans);
		for (String bean : beans) {
			LOG.info("\t" + bean);
		}
	}
}
