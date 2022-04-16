package com.othmen.produits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.othmen.produits.repos.ProduitRepository;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner {
	@Autowired
private ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProduitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Produit prod = new Produit("PC Dell",2200.500,new Date()); 
		//produitRepository.save(prod);
	}

}
