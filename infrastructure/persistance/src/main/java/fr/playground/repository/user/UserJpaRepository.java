package fr.playground.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserJpaRepository extends JpaRepository<User, BigInteger> {
}
