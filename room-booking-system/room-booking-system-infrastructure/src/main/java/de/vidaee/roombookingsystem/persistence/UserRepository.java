package de.vidaee.roombookingsystem.persistence;


import java.util.Arrays;
import java.util.List;



import org.springframework.stereotype.Repository;


import de.vidaee.roombookingsystem.entitities.*;
import de.vidaee.roombookingsystem.persistence.entities.UserDao;
import de.vidaee.roombookingsystem.repositories.IUserRepository;



@Repository
public class UserRepository implements IUserRepository {

   private final IUserDaoPostgres dao;

   public UserRepository(IUserDaoPostgres dao) {
      this.dao= dao;
   }

    @Override
  public List<User> list() {

      List<UserDao> users = this.dao.findAll();

     return Arrays.asList(new User("John", "Smith"), new User("John", "Doe"));
   }

   @Override
   public User get(Long id) {
      throw new UnsupportedOperationException("Feature incomplete. Contact assistance.");
   }

   @Override
   public void save(User user) { 
throw new UnsupportedOperationException("Feature incomplete. Contact assistance.");
   }

   @Override
   public void delete(Long aLong) { 
    throw new UnsupportedOperationException("Feature incomplete. Contact assistance.");
   }
    
}

