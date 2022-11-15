package com.app.web.service;

import java.util.List;

import com.app.web.entity.Offer;

public interface OfferService {
	
	public List<Offer> mostrarOfertas();
	
	public Offer guardarOferta(Offer oferta);
	
	public Offer obtenerOfertaPorId(Long id);
	
	public Offer actaulizarOferta(Offer oferta);
	
	public void eliminarOferta(Long id);
}

