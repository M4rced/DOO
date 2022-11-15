package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Offer;
import com.app.web.repository.OfferRepository;

@Service
public class OfferServiceImplementation implements OfferService {
	
	@Autowired
	private OfferRepository repository;
	
	@Override
	public List<Offer> mostrarOfertas() {
		return repository.findAll();
	}

	//@Override
	//public void createOffer() {
		// TODO Auto-generated method stub
		
}

