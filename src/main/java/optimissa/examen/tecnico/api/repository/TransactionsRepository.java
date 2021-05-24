package optimissa.examen.tecnico.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import optimissa.examen.tecnico.api.entity.TransactionsEntity;

@Repository
public interface TransactionsRepository
		extends JpaRepository<TransactionsEntity, Long>, JpaSpecificationExecutor<TransactionsEntity> {
}
