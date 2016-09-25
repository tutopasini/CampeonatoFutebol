package campeonato;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ClubeTorcida implements Serializable {

	@ManyToOne
	private Clube clube;
	
	@ManyToOne
	private TorcidaOrganizada torcidaOrganizada;
	
}
