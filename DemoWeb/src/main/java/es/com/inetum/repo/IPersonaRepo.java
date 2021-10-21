package es.com.inetum.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.com.inetum.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
