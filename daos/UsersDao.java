package billGuru.dao;

import java.util.List;

import billGuru.core.exceptions.CustomException;
import billGuru.domain.PremiumUsers;
import billGuru.domain.Users;


public interface UsersDao {

    Users getUserById(long id) throws CustomException;
    
    List<Users> getAllUsers();
    
    List<Users> getUserByName(String name);
    
    List<Users> getUserBySurname(String surname);
    
    List<Users> getUserByAppartment(String appartment);
    
    List<PremiumUsers> getPremiumUsersByPoints(int points);
    
    void saveUser(Users user);
    
    void updateUser(Users user);
    
    void deleteUser(Users user);
    
}