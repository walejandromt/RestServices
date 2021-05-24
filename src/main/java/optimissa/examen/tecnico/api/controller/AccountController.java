package optimissa.examen.tecnico.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import optimissa.examen.tecnico.api.model.AccountResponse;
import optimissa.examen.tecnico.api.model.BalanceResponse;
import optimissa.examen.tecnico.api.services.AccountService;

@Log4j2
@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("findAllAccounts")
	public AccountResponse findAllAccounts() {
		log.info("findAllAccounts");
		return new AccountResponse(accountService.findAllAccounts());
	}

	@GetMapping("findCurrentBalanceByAccount/{account}")
	public BalanceResponse findCurrentBalanceByAccount(@PathVariable Long account) {
		log.info("findCurrentBalanceByAccount {}", account);
		return new BalanceResponse(accountService.findCurrentBalanceByAccount(account));
	}
}
