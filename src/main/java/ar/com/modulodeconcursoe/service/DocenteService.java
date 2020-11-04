package ar.com.modulodeconcursoe.service;

import java.util.List;
import ar.com.modulodeconcurso.domain.Docente;

public interface DocenteService {

    List<Docente> findAllDocentes();

    Docente findDocenteById(Long id);

    //save
    //Docente saveDocente(Docente docente);

    //update
    Docente updateDocente(Docente docente);

    //delete
    //Docente deleteDocente(Docente docente);

}
