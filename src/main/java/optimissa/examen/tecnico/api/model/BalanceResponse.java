package optimissa.examen.tecnico.api.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import optimissa.examen.tecnico.api.entity.AccountEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BalanceResponse implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 9189676877459281522L;

	private AccountEntity balance;
}
