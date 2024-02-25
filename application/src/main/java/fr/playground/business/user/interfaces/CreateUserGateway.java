package fr.playground.business.user.interfaces;

import fr.playground.User;

public interface CreateUserGateway {
    User createUser(String email);
}
