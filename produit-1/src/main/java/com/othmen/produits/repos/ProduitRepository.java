package com.othmen.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.othmen.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
