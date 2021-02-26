package indi.ryan.igreendatachallenge.persistence.repository;

import indi.ryan.igreendatachallenge.persistence.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> getAccountsByUser_Id(Long userId);

}
