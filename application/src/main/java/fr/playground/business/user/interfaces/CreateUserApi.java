package fr.playground.business.user.interfaces;

import fr.playground.business.user.model.CreateUserInput;

import java.math.BigInteger;

public interface CreateUserApi {
    BigInteger createUser(CreateUserInput input);
}
