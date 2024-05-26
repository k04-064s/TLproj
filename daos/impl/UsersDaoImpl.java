package billGuru.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

import billGuru.core.exceptions.CustomException;
import billGuru.dao.UsersDao;
import billGuru.domain.PremiumUsers;
import billGuru.domain.Users;

public class UsersDaoImpl implements UsersDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Users getUserById(long id) throws CustomException {
        return entityManager.find(Users.class, id);
    }

    @Override
    public List<Users> getAllUsers() {
        TypedQuery<Users> query = entityManager.createQuery("SELECT u FROM Users u", Users.class);
        return query.getResultList();
    }

    @Override
    public List<Users> getUserByName(String name) {
        TypedQuery<Users> query = entityManager.createQuery("SELECT u FROM Users u WHERE u.name = :name", Users.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    @Override
    public List<Users> getUserBySurname(String surname) {
        TypedQuery<Users> query = entityManager.createQuery("SELECT u FROM Users u WHERE u.surname = :surname", Users.class);
        query.setParameter("surname", surname);
        return query.getResultList();
    }

    @Override
    public List<Users> getUserByAppartment(String appartment) {
        TypedQuery<Users> query = entityManager.createQuery("SELECT u FROM Users u WHERE u.appartment = :appartment", Users.class);
        query.setParameter("appartment", appartment);
        return query.getResultList();
    }

    @Override
    public List<PremiumUsers> getPremiumUsersByPoints(int points) {
        TypedQuery<PremiumUsers> query = entityManager.createQuery("SELECT p FROM PremiumUsers p WHERE p.points = :points", PremiumUsers.class);
        query.setParameter("points", points);
        return query.getResultList();
    }

    @Override
    public void saveUser(Users user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(Users user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(Users user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }
}