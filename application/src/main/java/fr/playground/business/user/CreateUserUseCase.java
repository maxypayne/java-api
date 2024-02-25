package fr.playground.business.user;

import fr.playground.annotation.UseCase;
import fr.playground.business.user.interfaces.CreateUserApi;
import fr.playground.business.user.model.CreateUserInput;

import java.math.BigInteger;

@UseCase
public class CreateUserUseCase implements CreateUserApi {
    CreateUserGateway createUserGateway;
    public CreateUserUseCase() {

    }
    @Override
    public BigInteger createUser(CreateUserInput input) {
        return null;
    }
}
