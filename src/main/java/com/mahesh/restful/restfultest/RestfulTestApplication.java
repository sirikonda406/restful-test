package com.mahesh.restful.restfultest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestfulTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestfulTestApplication.class, args);
	}

	@RestController
  public class HelloWorld{

		@GetMapping("/hello")
		public String rtrvNames(){

			return "hello mahesh";
		}

  }

}
