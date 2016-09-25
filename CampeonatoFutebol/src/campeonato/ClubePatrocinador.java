package campeonato;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ClubePatrocinador implements Serializable {

	@ManyToOne
	private Clube clube;
	
	@ManyToOne
	private Patrocinador patrocinador;
	
}