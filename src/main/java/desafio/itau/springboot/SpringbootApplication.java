package desafio.itau.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println("TESTE CONFIGURACAO");
        
        return application.sources(SpringbootApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

        System.out.println("INICIALIZACAO COMPLETA");
	}

}