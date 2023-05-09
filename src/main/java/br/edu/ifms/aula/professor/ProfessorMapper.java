package br.edu.ifms.aula.professor;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ProfessorMapper {
	 public static final ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);
	    
	    public ProfessorDto toDto(Professor entity);
	    
	    public List<ProfessorDto> map(List<Professor> items);

	    @Mapping(target = "id", ignore = true)
	    public void update(ProfessorForm dto, @MappingTarget Professor entity);

	    @Mapping(target = "id", ignore = true)
	    public Professor toEntity(ProfessorForm form);
}
