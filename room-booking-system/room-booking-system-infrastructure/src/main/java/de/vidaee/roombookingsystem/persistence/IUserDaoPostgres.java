package de.vidaee.roombookingsystem.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import de.vidaee.roombookingsystem.persistence.entities.UserDao;

public interface IUserDaoPostgres extends JpaRepository<UserDao, Long>  {
    
}
