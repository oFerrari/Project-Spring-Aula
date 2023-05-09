package br.edu.ifms.aula.professor;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity // Anotação para indicar que a classe é uma entidade mapeada no banco de dados
@Data // Gera automaticamente os métodos getters, setters, equals, hashCode e toString para todos os campos da classe
@EqualsAndHashCode // Gera automaticamente os métodos equals e hashCode
@AllArgsConstructor // Cria um construtor com todos os argumentos
@NoArgsConstructor // Cria um construtor vazio
@Builder // Fornece um padrão de construção fluente para criar instâncias da classe
public class Professor implements Serializable{
	@Id // Indica que o campo 'id' é a chave primária da entidade
	@GeneratedValue // Gera um valor automaticamente para a chave primária
	private Long id;
	private String nome;
	private String email;
}
