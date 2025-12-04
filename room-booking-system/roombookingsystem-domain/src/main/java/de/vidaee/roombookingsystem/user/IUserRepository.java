package de.vidaee.roombookingsystem.user;

public interface IUserRepository {

    Iterable<User> list();

    User get(Long id);

    void save(User user);

    void delete(Long id);

}
