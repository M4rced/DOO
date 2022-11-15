package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.web.entity.Offer;
import com.app.web.service.OfferService;

@RestController
@RequestMapping
public class OfferController {

	@Autowired
	private OfferService service;

	@GetMapping({ "/Ofertas", "/" })
	public String mostrarOfertas(Model modelo) {
		modelo.addAttribute("ofertas", service.mostrarOfertas());
		return "ofertas"; // retorna el archivo de ofertas
	}

	@GetMapping("/Ofertas/nueva")
	public String crearOfertaFormuario(Model modelo) {
		Offer oferta = new Offer();
		modelo.addAttribute("oferta", oferta);
		return "Crear_Oferta";
	}

	@PostMapping("/Ofertas")
	public String guardarOferta(@ModelAttribute("oferta") Offer oferta) {
		service.guardarOferta(oferta);
		return "redirect:/ofertas";
	}

	@GetMapping("/Ofertas/editar/{id}")
	public String mostrarFormularioEditarOferta(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("oferta", service.obtenerOfertaPorId(id));
		return "editar_Ofertas";
	}

	/*
	 * @PostMapping("/Ofertas/{id}") public String actualizarOferta(@PathVariable
	 * Long id,@ModelAttribute("ofera") Offer oferta, Model modelo) { Offer
	 * ofertaExistente = service.obtenerOfertaPorId(id); ofertaExistente.setId(id);
	 * ofertaExistente.setNombre(oferta.getNombre());
	 * ofertaExistente.setPrecio(oferta.getPrecio());
	 * ofertaExistente.setInfomracionAdicional(oferta.getInfomracionAdicional());
	 * return "redirect:/ofertas";
	 * 
	 * service.actaulizarOferta(ofertaExistente); return "redirect:/ofertas";
	 * 
	 * }
	 */

	@GetMapping("/Ofertas/{id}")
	public String eliminarOferta(@PathVariable Long id) {
		service.eliminarOferta(id);
		return "redirect:/Ofertas";
	}

}