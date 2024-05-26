package billGuru.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

import billGuru.core.exceptions.CustomException;
import billGuru.dao.ReportsDao;
import billGuru.domain.Reports;
import billGuru.domain.Users;

public class ReportsDaoImpl implements ReportsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Reports getReportById(long id) throws CustomException {
        return entityManager.find(Reports.class, id);
    }

    @Override
    public List<Reports> getAllReports() {
        TypedQuery<Reports> query = entityManager.createQuery("SELECT r FROM Reports r", Reports.class);
        return query.getResultList();
    }

    @Override
    public List<Reports> getReportByTitle(String title) {
        TypedQuery<Reports> query = entityManager.createQuery("SELECT r FROM Reports r WHERE r.title = :title", Reports.class);
        query.setParameter("title", title);
        return query.getResultList();
    }

    @Override
    public List<Reports> getReportsByStatus(String status) {
        TypedQuery<Reports> query = entityManager.createQuery("SELECT r FROM Reports r WHERE r.status = :status", Reports.class);
        query.setParameter("status", status);
        return query.getResultList();
    }

    @Override
    public List<Reports> getReportsByUserId(Users userId){
    	 TypedQuery<Reports> query = entityManager.createQuery(
    		        "SELECT r FROM Reports r WHERE r.userId = :userId", Reports.class);
    		    query.setParameter("userId", userId);
    		    return query.getResultList();
    }
    @Override
    public void saveReport(Reports report) {
        entityManager.persist(report);
    }

    @Override
    public void updateReport(Reports report) {
        entityManager.merge(report);
    }

    @Override
    public void deleteReport(Reports report) {
        entityManager.remove(entityManager.contains(report) ? report : entityManager.merge(report));
    }
}