package br.com.floricultura.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.floricultura.domain.Produto;
import br.com.floricultura.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;

	
	@GetMapping(value="/{id}")
	public ResponseEntity<Produto> findById(@PathVariable int id){		
		Produto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){		
		List<Produto> list=   service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
