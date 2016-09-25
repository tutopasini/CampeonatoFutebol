package campeonato;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class TecnicoClube implements Serializable {

	@ManyToOne
	private Clube clube;
	
	@ManyToOne
	private Tecnico tecnico;
	
}