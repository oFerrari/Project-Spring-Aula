package br.edu.ifms.aula.professor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Professor não encontrado")
public class ProfessorNotFoundException extends ResponseStatusException{
	
	public ProfessorNotFoundException(String errorMessage) {
		super(HttpStatus.NOT_FOUND, errorMessage);
	}
	
}
