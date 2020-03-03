package interfaceServices;

import java.util.List;
import java.util.Optional;

import modelo.PersonaM;

public interface PersonaSI {

	public List<PersonaM> listarPersona() throws Exception;

	public Optional<PersonaM> listarId(int id) throws Exception;

	public int save(PersonaM p) throws Exception;

	public void delete(int id) throws Exception;

}
