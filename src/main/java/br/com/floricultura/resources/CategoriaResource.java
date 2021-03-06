package br.com.floricultura.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.floricultura.domain.Categoria;
import br.com.floricultura.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	
	@GetMapping(value="/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable int id){		
		Categoria obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){		
		List<Categoria> list=   service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
