package indi.ryan.igreendatachallenge.persistence.repository;

import indi.ryan.igreendatachallenge.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
