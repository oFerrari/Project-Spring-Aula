package br.edu.ifms.aula.professor;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfessorMapper {
	public static final ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);
	
	public ProfessorDto toDto(Professor entity); //Converte Entity para Dto
	
	public Professor toEntity (ProfessorDto dto);  //Converte Dto para Entity
	
	public List<ProfessorDto> map(List<Professor> items);	//Mapeia a classe Professor
}