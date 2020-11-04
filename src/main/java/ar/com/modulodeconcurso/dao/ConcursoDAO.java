package ar.com.modulodeconcurso.dao;

import ar.com.modulodeconcurso.domain.Concurso;
import org.springframework.data.repository.CrudRepository;

public interface ConcursoDAO extends CrudRepository<Concurso, Long> {

    Concurso findConcursoByEspacioCurricular(String espacioCurricular);

    Concurso findConcursoByFechaCitacion(String fechaCitacion);

    Concurso findConcursoByNombreCarrera(String nombreCarrera);

    Concurso findConcursoByResolucion(String resolucion);

}
