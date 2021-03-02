package indi.ryan.igreendatachallenge.persistence.repository;

import indi.ryan.igreendatachallenge.persistence.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
