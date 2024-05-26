package billGuru.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import billGuru.core.exceptions.CustomException;
import billGuru.dao.OffersDao;
import billGuru.domain.Admins;
import billGuru.domain.Offers;
import billGuru.domain.PremiumUsers;

@Repository
public class OffersDaoImpl implements OffersDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Offers getOfferById(long id) throws CustomException {
        return entityManager.find(Offers.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Offers> getAllOffers() {
        Query query = entityManager.createQuery("SELECT o FROM Offers o");
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Offers> getOfferByAdminId(Admins adminId) {
        Query query = entityManager.createQuery("SELECT o FROM Offers o WHERE o.admin = :adminId");
        query.setParameter("adminId", adminId);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Offers> getOffersByDiscount(Double discount) {
        Query query = entityManager.createQuery("SELECT o FROM Offers o WHERE o.discount = :discount");
        query.setParameter("discount", discount);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Offers> getOffersByPremUserId(PremiumUsers premUserId) {
        Query query = entityManager.createQuery("SELECT o FROM Offers o WHERE o.premiumUser = :premUserId");
        query.setParameter("premUserId", premUserId);
        return query.getResultList();
    }

    @Override
    public void saveOrder(Offers offer) {
        entityManager.persist(offer);
    }

    @Override
    public void updateOrder(Offers offer) {
        entityManager.merge(offer);
    }

    @Override
    public void deleteOrder(Offers offer) {
        entityManager.remove(offer);
    }
}