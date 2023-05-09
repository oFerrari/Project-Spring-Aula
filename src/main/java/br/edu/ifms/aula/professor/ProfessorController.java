package br.edu.ifms.aula.professor;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorService service;
	
	@GetMapping
	public ResponseEntity<List<ProfessorDto>> listar() {
		List<Professor> listaEntity = service.listar();
		List<ProfessorDto> listaDto = ProfessorMapper.INSTANCE.map(listaEntity);
		return ResponseEntity.ok().body(listaDto);
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<ProfessorDto> cadastrar(@RequestBody @Valid ProfessorForm form){
		Professor entity = ProfessorMapper.INSTANCE.toEntity(form);
		service.salvar(entity);
		ProfessorDto dto = ProfessorMapper.INSTANCE.toDto(entity);
		return ResponseEntity.accepted().body(dto);
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ProfessorDto> atualizar(@PathVariable Long id, @RequestBody @Valid ProfessorForm form){
		Professor entity = service.atualizar(id, form);
		ProfessorDto dto = ProfessorMapper.INSTANCE.toDto(entity);
		return ResponseEntity.ok(dto);	
	}
	
	@DeleteMapping
	@Transactional
	public ResponseEntity<?> excluir(@PathVariable Long id){
		service.excluir(id);
		return ResponseEntity.ok().build();
	}
	
}
