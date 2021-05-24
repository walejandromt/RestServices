package optimissa.examen.tecnico.api.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import optimissa.examen.tecnico.api.entity.TransactionsEntity;
import optimissa.examen.tecnico.api.repository.AccountRepository;
import optimissa.examen.tecnico.api.repository.TransactionsRepository;
import optimissa.examen.tecnico.api.services.TransactionsService;

@Log4j2
@Service
public class TransactionsServiceImpl implements TransactionsService {

	@Autowired
	private TransactionsRepository transactionsRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Override
	@Transactional
	public TransactionsEntity transferAmount(TransactionsEntity input) {
		log.info("Subtract amount of the account {}", input);
		accountRepository.subtractAmount(input.getFromAccount(), input.getAmount());

		log.info("add amount", input);
		accountRepository.addAmount(input.getToAccount(), input.getAmount());

		log.info("Save transaction entity", input);
		input.setSentAt(LocalDateTime.now());
		return transactionsRepository.save(input);
	}

	@Override
	public List<TransactionsEntity> findAllTransactions() {
		return transactionsRepository.findAll();
	}

}
