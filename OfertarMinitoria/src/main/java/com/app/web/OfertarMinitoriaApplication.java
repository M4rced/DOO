package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entity.Offer;
import com.app.web.repository.OfferRepository;

@SpringBootApplication
public class OfertarMinitoriaApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(OfertarMinitoriaApplication.class, args);
	}
	
	@Autowired
	private OfferRepository repository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Offer offerOne = new Offer("Monitoria Algoritmos","10.000","Todo sobre metodos de ordenamiento");
		repository.save(offerOne);
		
		Offer offerTwo = new Offer("Monitoria Algebra","15.000","Abordaremos temas de division sentetica y logaritmos");
		repository.save(offerTwo);
		*/
	}

}
