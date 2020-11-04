/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.modulodeconcurso.dao;

import ar.com.modulodeconcurso.domain.Concurso;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ryzen 3400G
 */
public interface ConcursoDAO extends CrudRepository <Concurso, Long>{
    
}
