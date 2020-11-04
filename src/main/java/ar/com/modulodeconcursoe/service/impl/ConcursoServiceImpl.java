package ar.com.modulodeconcursoe.service.impl;

import ar.com.modulodeconcurso.domain.Concurso;
import ar.com.modulodeconcursoe.service.ConcursoService;
import ar.com.modulodeconcurso.dao.ConcursoDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class ConcursoServiceImpl implements ConcursoService {

    @Autowired
    private ConcursoDAO concursoDAO;

    @Override
    public List<Concurso> findAllConcursos() {
        return (List<Concurso>) concursoDAO.findAll();
    }

    @Override
    public Concurso findConcursoById(Long id) {
        return concursoDAO.findById(id).orElse(null);
    }

    // @Override
    //public Docente saveConcurso(Concurso concurso) {
    //}
    @Override
    public Concurso updateConcurso(Concurso concurso) {
        if (concurso == null) {
            //return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }

        if (concurso.getId() == null) {
            // return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }

        Concurso concursoAux = concursoDAO.findById(concurso.getId())
                .orElseThrow(() -> new IllegalArgumentException("No se encontró la cuenta especificada"));

        if (concursoAux == null) {
            // return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }

        return concursoDAO.save(concurso);
    }

    // @Override
    //public Docente deleteConcurso(Concurso concurso) {
    //}
}
