package com.bleedev.spring3.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bleedev.spring3.annotations.AnnotationUtils;

@SpringBootApplication
public class Spring3CompilerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring3CompilerApplication.class, args);
		AnnotationUtils.utilMethod();
	}

}
