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

	@Override
	public Offer guardarOferta(Offer oferta) {
		return repository.save(oferta);
	}

	@Override
	public Offer obtenerOfertaPorId(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Offer actaulizarOferta(Offer oferta) {
		return repository.save(oferta);
	}

	@Override
	public void eliminarOferta(Long id) {
		repository.deleteById(id);
		
	}

}

