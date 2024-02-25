package fr.playground.repository.user;

import fr.playground.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserJpaRepository extends JpaRepository<User, BigInteger> {
}
