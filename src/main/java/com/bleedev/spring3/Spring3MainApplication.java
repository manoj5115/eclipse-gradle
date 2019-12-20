package com.bleedev.spring3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bleedev.spring3.annotations.AnnotationUtils;

@SpringBootApplication
public class Spring3MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring3MainApplication.class, args);
		AnnotationUtils.utilMethod();
	}

}
