package dev.cat.bookshop;

import org.springframework.boot.SpringApplication;

public class TestBookshopApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookshopApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
