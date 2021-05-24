package optimissa.examen.tecnico.api.model;

import java.io.Serializable;
import java.util.List;

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
public class AccountResponse implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -3728625514924392234L;
	
	private List<AccountEntity> accounts;

}
