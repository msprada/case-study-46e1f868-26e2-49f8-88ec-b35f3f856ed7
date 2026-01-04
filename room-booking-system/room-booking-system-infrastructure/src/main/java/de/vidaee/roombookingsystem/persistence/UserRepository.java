package de.vidaee.roombookingsystem.persistence;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.vidaee.roombookingsystem.entitities.*;
import de.vidaee.roombookingsystem.persistence.entities.UserDao;
import de.vidaee.roombookingsystem.persistence.services.MappingService;
import de.vidaee.roombookingsystem.repositories.IUserRepository;

@Repository
public class UserRepository implements IUserRepository {

   @Autowired
   private MappingService mappingService;

   private final IUserDaoPostgres dao;

   public UserRepository(IUserDaoPostgres dao) {
      this.dao = dao;
   }

   @Override
   public List<User> list() {

      List<UserDao> users = this.dao.findAll();

      List<User> userSet = this.mappingService.mapList(users, User.class);
      // return Arrays.asList(new User("John", "Smith"), new User("John", "Doe"));

      return userSet;
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
