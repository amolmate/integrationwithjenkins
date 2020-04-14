package com.imageupload;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationImageUpload {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationImageUpload.class, args);
		Logger.getLogger("").log(Level.ALL, "Hi in main");
	}
}