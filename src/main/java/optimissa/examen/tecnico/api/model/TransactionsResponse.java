package optimissa.examen.tecnico.api.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import optimissa.examen.tecnico.api.entity.TransactionsEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TransactionsResponse implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 5407962701856164465L;

	private List<TransactionsEntity> transactions;
}
