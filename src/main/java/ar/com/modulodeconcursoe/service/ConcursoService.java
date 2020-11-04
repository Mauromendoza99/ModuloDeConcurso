
package ar.com.modulodeconcursoe.service;

import ar.com.modulodeconcurso.domain.Concurso;
import java.util.List;

public interface ConcursoService {

    List<Concurso> findAllConcursos();

    Concurso findConcursoById(Long id);

    //save
    //Concurso saveConcurso(Concurso concurso);

    //update
    Concurso updateConcurso(Concurso concurso);

    //delete
    //Concurso deleteConcurso(Concurso concurso);

}
