package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import inrefaces.PersonaI;
import interfaceServices.PersonaSI;
import modelo.PersonaM;

public class PersonaS implements PersonaSI {

	@Autowired
	private PersonaI data; // Importamos de la interfaces

	@Override
	public List<PersonaM> listarPersona() throws Exception {
		// TODO Auto-generated method stub
		return (List<PersonaM>) data.findAll();
	}

	@Override
	public Optional<PersonaM> listarId(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(PersonaM p) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub

	}

}
