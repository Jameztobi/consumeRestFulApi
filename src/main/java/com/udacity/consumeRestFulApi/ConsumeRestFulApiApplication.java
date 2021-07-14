package com.udacity.consumeRestFulApi;

import com.udacity.consumeRestFulApi.entity.DogFact;
import com.udacity.consumeRestFulApi.entity.Joke;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ConsumeRestFulApiApplication {
	private static final Logger log =  LoggerFactory.getLogger(ConsumeRestFulApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestFulApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
//		return args -> {
//			Joke[] joke = restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke", Joke[].class);
//			log.info(joke.toString());
//		};
//
//	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			DogFact[] dogFact = restTemplate.getForObject("https://dog-facts-api.herokuapp.com/api/v1/resources/dogs/all", DogFact[].class);
			log.info(dogFact.toString());
		};

	}

}
