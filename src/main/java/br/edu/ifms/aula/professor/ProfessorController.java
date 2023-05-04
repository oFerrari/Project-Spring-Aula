package br.edu.ifms.aula.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ProfessorDto>> listar() {
		List<Professor> listaEntity = repository.findAll();
		List<ProfessorDto> listaDto = ProfessorMapper.INSTANCE.map(listaEntity);
		return ResponseEntity.ok().body(listaDto);
	}
}
