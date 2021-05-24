package optimissa.examen.tecnico.api.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "API_TRANSACTIONS")
public class TransactionsEntity implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 111719574870105116L;

	@Id
	@Column(name = "FROM_ACCOUNT")
	private Long fromAccount;

	@Column(name = "TO_ACCOUNT")
	private Long toAccount;

	@Column(name = "AMOUNT")
	private Double amount;

	@Column(name = "SENT_AT")
	private LocalDateTime sentAt;
}
