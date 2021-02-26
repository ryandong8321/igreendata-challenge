package indi.ryan.igreendatachallenge.persistence.repository;

import indi.ryan.igreendatachallenge.persistence.entity.TransactionInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionInfo, Long> {

    Page<TransactionInfo> findTransactionInfosByAccountDetail_Id(Long accountId, Pageable pageable);

}
