package br.com.floricultura.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@GetMapping(value="/teste")
	public String teste(){
		
		return "REST funcionando";
	}
}
