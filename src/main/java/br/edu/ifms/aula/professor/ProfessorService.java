package br.edu.ifms.aula.professor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
	@Autowired
	private ProfessorRepository repository;
	
	public List<Professor> listar(){
		return repository.findAll();
	}
	
	public Professor salvar(Professor entity) {
		Professor p = repository.save(entity);
		return p;
	}
	
	public Professor atualizar(Long id, ProfessorForm form) {
		
		Professor entity = buscarPorId(id);
		ProfessorMapper.INSTANCE.update(form, entity);
		return entity;
	}
	
	private Professor buscarPorId(Long id) {
		Optional<Professor> optional = repository.findById(id);
		if(optional.isEmpty()) {
			String msg = "Não existe Professor para o codigo [%d] informado";
			throw new ProfessorNotFoundException(String.format(msg, id));
		}
		return optional.get();
	}

	public void excluir(Long id) {
		Professor entity = buscarPorId(id);
		repository.delete(entity);
		throw new UnsupportedOperationException("Not Supported Yet");
		
	}
}
