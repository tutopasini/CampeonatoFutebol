package campeonato;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rodadas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	
	private int totalJogos;
	private int totalGols;
	private int totalAmarelos;
	private int totalVermelhos;
}
