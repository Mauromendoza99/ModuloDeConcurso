package ar.com.modulodeconcursoe.service.impl;

import ar.com.modulodeconcurso.dao.DocenteDAO;
import ar.com.modulodeconcurso.domain.Docente;
import ar.com.modulodeconcursoe.service.DocenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class DocenteServiceImpl implements DocenteService {

    @Autowired
    private DocenteDAO docenteDAO;

    @Override
    public List<Docente> findAllDocentes() {
        return (List<Docente>) docenteDAO.findAll();
    }

    @Override
    public Docente findDocenteById(Long id) {
        return docenteDAO.findById(id).orElse(null);
    }

    // @Override
    //public Docente saveDocente(Docente docente) {
    //}
    @Override
    public Docente updateDocente(Docente docente) {
        if (docente == null) {
            //return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }

        if (docente.getId() == null) {
            // return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }

        Docente docenteAux = docenteDAO.findById(docente.getId())
                .orElseThrow(() -> new IllegalArgumentException("No se encontró la cuenta especificada"));

        if (docenteAux == null) {
            // return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }

        return docenteDAO.save(docente);
    }

    //@Override
    //public Docente deleteDocente(Docente docente) {
    //}
}
