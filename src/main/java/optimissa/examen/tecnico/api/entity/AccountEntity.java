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
@Table(name = "API_ACCOUNT")
public class AccountEntity implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -3428326185078456602L;

	@Id
	@Column(name = "ACCOUNT")
	private Long account;

	@Column(name = "BALANCE")
	private Double balance;

	@Column(name = "OWNER")
	private Long owner;

	@Column(name = "CREATED_AT")
	private LocalDateTime createdAt;
}
