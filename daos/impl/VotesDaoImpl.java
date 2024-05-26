package billGuru.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import billGuru.core.exceptions.CustomException;
import billGuru.dao.VotesDao;
import billGuru.domain.Admins;
import billGuru.domain.Users;
import billGuru.domain.Votes;

@Repository
public class VotesDaoImpl implements VotesDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Votes getVoteById(long id) throws CustomException {
        return entityManager.find(Votes.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Votes> getAllVotes() {
        Query query = entityManager.createQuery("SELECT v FROM Votes v");
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Votes> getVoteByName(String name) {
        Query query = entityManager.createQuery("SELECT v FROM Votes v WHERE v.name = :name");
        query.setParameter("name", name);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Votes> getVotesByAdminId(Admins adminId) {
        Query query = entityManager.createQuery("SELECT v FROM Votes v WHERE v.adminId = :adminId");
        query.setParameter("adminId", adminId);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Votes> getVotesByUserId(Users userId) {
        Query query = entityManager.createQuery("SELECT v FROM Votes v WHERE v.userId = :userId");
        query.setParameter("userId", userId);
        return query.getResultList();
    }

    @Override
    public void saveVotes(Votes vote) {
        entityManager.persist(vote);
    }

    @Override
    public void updateVotes(Votes vote) {
        entityManager.merge(vote);
    }

    @Override
    public void deleteVotes(Votes vote) {
        entityManager.remove(vote);
    }
}