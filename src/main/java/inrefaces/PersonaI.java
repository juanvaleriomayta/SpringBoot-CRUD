package inrefaces;

import org.springframework.data.repository.CrudRepository;

import modelo.PersonaM;

public interface PersonaI extends CrudRepository<PersonaM, Integer> {

}
