package de.vidaee.roombookingsystem.repositories;

import de.vidaee.roombookingsystem.entitities.User;

public interface IUserRepository {

    Iterable<User> list();

    User get(Long id);

    void save(User user);

    void delete(Long id);

}
