package es.com.inetum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.com.inetum.repository.IPersona;

@Service
public class IPersonaServiceImpl implements IPersonaService {
	
	@Autowired
	@Qualifier("persona2")
	IPersona repo;

	@Override
	public void registrarHandler(String pNombre) {
		repo.registrar(pNombre);

	}

}
