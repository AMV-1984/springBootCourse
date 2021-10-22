package es.com.inetum.repo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import es.com.inetum.model.Usuario;
import es.com.inetum.repo.IUsuarioRepo;

@SpringBootTest
class IUsuarioRepoTest {
	
	@Autowired
	IUsuarioRepo usuRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void testAgregar() {
		Usuario usu = new Usuario(0, "user", encoder.encode("user"));
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals("user", usuRetorno.getNombre());
	}

}
