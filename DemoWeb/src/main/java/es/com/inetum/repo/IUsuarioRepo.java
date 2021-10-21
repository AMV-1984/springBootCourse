package es.com.inetum.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.com.inetum.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

}
