package ar.com.minoche.dao;

import ar.com.minoche.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

    Persona findPersonaByNombre(String nombre);

    Persona findPersonaByApellido(String apellido);

    Persona findPersonaByNDocuemento(int ndocumento);

    Persona findPersonaByCelular(int celular);

    Persona findPersonaByEmail(String email);

    Persona findPersonaByContraseña(String contraseña);

}
