package optimissa.examen.tecnico.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import optimissa.examen.tecnico.api.entity.TransactionsEntity;
import optimissa.examen.tecnico.api.model.TransactionsResponse;
import optimissa.examen.tecnico.api.services.TransactionsService;

@Log4j2
@RestController
public class TransactionsController {

	@Autowired
	private TransactionsService transactionsService;

	@PostMapping("transferAmount")
	public TransactionsEntity transferAmount(@RequestBody TransactionsEntity input) {
		log.info("transferAmount {}", input);
		return transactionsService.transferAmount(input);
	}

	@GetMapping("findAllTransactions")
	public TransactionsResponse findAllTransactions() {
		log.info("findAllTransactions");
		return new TransactionsResponse(transactionsService.findAllTransactions());
	}
}
