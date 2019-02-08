package br.com.floricultura;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.floricultura.domain.Categoria;
import br.com.floricultura.domain.Produto;
import br.com.floricultura.repositories.CategoriaRepository;
import br.com.floricultura.repositories.ProdutoRepository;



@SpringBootApplication
public class FloriculturaApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
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
		
		Produto p1 = new Produto(null, "Computador", 2000.0);
		Produto p2 = new Produto(null, "Impressora", 800.0);
		Produto p3 = new Produto(null, "Mouse", 60.0);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		p1.getCategorias().addAll(Arrays.asList(cat4));
		p2.getCategorias().addAll(Arrays.asList(cat3, cat5,cat6));
		p3.getCategorias().addAll(Arrays.asList(cat7,cat10));
		
		categoriaRepository.saveAll(
				Arrays.asList(cat1, cat2,cat3,cat4, cat5,cat6,
							  cat7, cat8,cat9,cat10, cat11,cat12,
							  cat13, cat14,cat15,cat16));
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
}

