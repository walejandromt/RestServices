package optimissa.examen.tecnico.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import optimissa.examen.tecnico.api.entity.AccountEntity;
import optimissa.examen.tecnico.api.repository.AccountRepository;
import optimissa.examen.tecnico.api.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public List<AccountEntity> findAllAccounts() {
		return accountRepository.findAll();
	}

	@Override
	public AccountEntity findCurrentBalanceByAccount(Long account) {
		return accountRepository.findByAccount(account);
	}

}
