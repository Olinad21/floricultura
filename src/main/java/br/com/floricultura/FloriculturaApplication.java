package br.com.floricultura;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.floricultura.domain.Categoria;
import br.com.floricultura.repositories.CategoriaRepository;



@SpringBootApplication
public class FloriculturaApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FloriculturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Tecnologia");
		Categoria cat4 = new Categoria(null, "casa mesa e banho");
		Categoria cat5 = new Categoria(null, "Cozinha");
		Categoria cat6 = new Categoria(null, "Quarto");
		Categoria cat7 = new Categoria(null, "Roupas Masculina");
		Categoria cat8 = new Categoria(null, "Roupas Feminas");
		Categoria cat9 = new Categoria(null, "Intimos");
		Categoria cat10 = new Categoria(null, "Escola");
		Categoria cat11= new Categoria(null, "Banheiro");
		Categoria cat12 = new Categoria(null, "Sala");
		Categoria cat13 = new Categoria(null, "Carros");
		Categoria cat14 = new Categoria(null, "Decorações de Sala");
		Categoria cat15 = new Categoria(null, "Decoraçoes de quarto");
		Categoria cat16 = new Categoria(null, "Decoraçoes de cozinha");
		
		categoriaRepository.saveAll(
				Arrays.asList(cat1, cat2,cat3,cat4, cat5,cat6,
							  cat7, cat8,cat9,cat10, cat11,cat12,
							  cat13, cat14,cat15,cat16));
	}
}

