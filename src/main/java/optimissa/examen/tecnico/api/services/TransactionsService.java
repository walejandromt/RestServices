package optimissa.examen.tecnico.api.services;

import java.util.List;

import optimissa.examen.tecnico.api.entity.TransactionsEntity;

public interface TransactionsService {

	TransactionsEntity transferAmount(TransactionsEntity input);

	List<TransactionsEntity> findAllTransactions();

}
