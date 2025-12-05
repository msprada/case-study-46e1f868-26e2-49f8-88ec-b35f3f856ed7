package de.vidaee.roombookingsystem;

public interface IUserRepository {

    Iterable<User> list();

    User get(Long id);

    void save(User user);

    void delete(Long id);

}
