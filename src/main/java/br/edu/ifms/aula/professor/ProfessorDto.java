package br.edu.ifms.aula.professor;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class ProfessorDto {
	private Long id;
	private String nome;
}
