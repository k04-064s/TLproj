package billGuru.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import billGuru.core.exceptions.CustomException;
import billGuru.dao.BillsDao;
import billGuru.domain.Admins;
import billGuru.domain.Bills;
import billGuru.domain.Users;

@Repository
public class BillsDaoImpl implements BillsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Bills getBillsById(long id) throws CustomException {
        return entityManager.find(Bills.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bills> getAllBills() {
        Query query = entityManager.createQuery("SELECT b FROM Bills b");
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bills> getBillsByStatus(String status) {
        Query query = entityManager.createQuery("SELECT b FROM Bills b WHERE b.status = :status");
        query.setParameter("status", status);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bills> getBillsByDueDate(Date dueDate) {
        Query query = entityManager.createQuery("SELECT b FROM Bills b WHERE b.dueDate = :dueDate");
        query.setParameter("dueDate", dueDate);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bills> getBillsByAdminId(Admins adminId) {
        Query query = entityManager.createQuery("SELECT b FROM Bills b WHERE b.adminId = :adminId");
        query.setParameter("adminId", adminId);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bills> getBillsByUserId(Users userId) {
        Query query = entityManager.createQuery("SELECT b FROM Bills b WHERE b.userId = :userId");
        query.setParameter("userId", userId);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bills> getBillsByAmount(Double amount) {
        Query query = entityManager.createQuery("SELECT b FROM Bills b WHERE b.amount = :amount");
        query.setParameter("amount", amount);
        return query.getResultList();
    }

    @Override
    public void saveBill(Bills bill) {
        entityManager.persist(bill);
    }

    @Override
    public void updateBill(Bills bill) {
        entityManager.merge(bill);
    }

    @Override
    public void deleteBill(Bills bill) {
        entityManager.remove(bill);
    }
}