package de.vidaee.roombookingsystem.persistence;

// import de.vidaee.roombookingsystem.entitities.User;
import de.vidaee.roombookingsystem.persistence.entities.UserDao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDaoPostgres extends JpaRepository<UserDao, Long>  {
    
}
