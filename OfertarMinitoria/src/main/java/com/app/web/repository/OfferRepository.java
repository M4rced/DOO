package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long>{

}
