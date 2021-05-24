package optimissa.examen.tecnico.api.services;

import java.util.List;

import optimissa.examen.tecnico.api.entity.AccountEntity;

public interface AccountService {

	List<AccountEntity> findAllAccounts();

	AccountEntity findCurrentBalanceByAccount(Long account);

}
