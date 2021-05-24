package optimissa.examen.tecnico.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import optimissa.examen.tecnico.api.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long>, JpaSpecificationExecutor<AccountEntity> {

	AccountEntity findByAccount(Long account);

	@Modifying
	@Query("UPDATE AccountEntity a SET a.balance = balance - :balance WHERE a.account = :account")
	Integer subtractAmount(@Param(value = "account") Long account, @Param(value = "balance") Double balance);

	@Modifying
	@Query("UPDATE AccountEntity a SET a.balance = balance + :balance WHERE a.account = :account")
	Integer addAmount(@Param(value = "account") Long account, @Param(value = "balance") Double balance);

}
