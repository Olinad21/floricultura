package br.com.floricultura.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.floricultura.domain.Categoria;
import br.com.floricultura.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria findById(int id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Categoria> findAll() {
		List<Categoria> obj = repo.findAll();
		return obj;
	}
	
	public Categoria update(Categoria obj) {
		Categoria objNew = new Categoria();
		objNew  = findById(obj.getId());		
		objNew.setNome(obj.getNome());
		
		return repo.save(objNew);
	}
}
