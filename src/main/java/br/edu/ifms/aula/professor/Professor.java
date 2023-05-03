package br.edu.ifms.aula.professor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity		//Cria uma tabela com o mesmo nome da classe
@Data		//Implementa o metodos GET and SETTERS para cada atributo
@EqualsAndHashCode		//	Criar o metodos S
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Professor {
	@Id
	@GeneratedValue	//Cria uma Sequency
	private Long id;
	private String nome;
	private String email;
	
	
}
