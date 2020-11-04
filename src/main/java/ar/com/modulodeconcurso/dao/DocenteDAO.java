package ar.com.modulodeconcurso.dao;

import ar.com.modulodeconcurso.domain.Docente;
import org.springframework.data.repository.CrudRepository;

public interface DocenteDAO extends CrudRepository<Docente, Long> {

    Docente findDocenteByNombre(String nombre);

    Docente findDocenteByApellido(String apellido);

    Docente findDocenteByDni(int dni);

    Docente findDocenteByEdad(String edad);

    Docente findDocenteByCodPostal(int codPostal);

    Docente findDocenteByEmail(String email);

    Docente findDocenteByTelefono(int telefono);

    Docente findDocenteByDomicilio(String domicilio);

}
