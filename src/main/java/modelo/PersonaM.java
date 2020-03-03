package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class PersonaM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String CODPER;
	private String NOMPER;
	private String TELPER;

	public PersonaM() {
		// Codigo autogenerado por java
	}

	public PersonaM(String CODPER, String NOMPER, String TELPER) {
		super();
		this.CODPER = CODPER;
		this.NOMPER = NOMPER;
		this.TELPER = TELPER;
	}

	public String getCODPER() {
		return CODPER;
	}

	public void setCODPER(String cODPER) {
		CODPER = cODPER;
	}

	public String getNOMPER() {
		return NOMPER;
	}

	public void setNOMPER(String nOMPER) {
		NOMPER = nOMPER;
	}

	public String getTELPER() {
		return TELPER;
	}

	public void setTELPER(String tELPER) {
		TELPER = tELPER;
	}

}
