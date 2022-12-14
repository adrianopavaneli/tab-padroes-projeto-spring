package me.dio.tabpadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class TabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TabPadroesProjetoSpringApplication.class, args);
	}

}
