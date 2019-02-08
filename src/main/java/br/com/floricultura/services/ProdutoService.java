package br.com.floricultura.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.floricultura.domain.Produto;
import br.com.floricultura.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public Produto findById(int id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Produto> findAll() {
		List<Produto> obj = repo.findAll();
		return obj;
	}
	
	public Produto update(Produto obj) {
		Produto objNew = new Produto();
		objNew  = findById(obj.getId());		
		objNew.setNome(obj.getNome());
		
		return repo.save(objNew);
	}
}
