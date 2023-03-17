package come.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
@EnableR2dbcRepositories
@SpringBootApplication
@ComponentScan(basePackages = {"come.crud.service","come.crud.repository","come.crud.controller"})
public class SpringWebfluxGomithaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxGomithaApplication.class, args);
	}

}
