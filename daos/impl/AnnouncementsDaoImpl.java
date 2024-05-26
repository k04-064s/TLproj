package billGuru.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import billGuru.core.exceptions.CustomException;
import billGuru.dao.AnnouncementsDao;
import billGuru.domain.Admins;
import billGuru.domain.Announcements;

@Repository
public class AnnouncementsDaoImpl implements AnnouncementsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Announcements getAnnouncemntById(long id) throws CustomException {
        return entityManager.find(Announcements.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Announcements> getAllAnnouncements() {
        Query query = entityManager.createQuery("SELECT a FROM Announcements a");
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Announcements> getAnnouncementByDate(Date date) {
        Query query = entityManager.createQuery("SELECT a FROM Announcements a WHERE a.date = :date");
        query.setParameter("date", date);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Announcements> getAnnouncementsByTitle(String title) {
        Query query = entityManager.createQuery("SELECT a FROM Announcements a WHERE a.title = :title");
        query.setParameter("title", title);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Announcements> getAnnouncementsByAdminId(Admins admin) {
        Query query = entityManager.createQuery("SELECT a FROM Announcements a WHERE a.adminId = :admin");
        query.setParameter("admin", admin);
        return query.getResultList();
    }

    @Override
    public void saveOrder(Announcements announcement) {
        entityManager.persist(announcement);
    }

    @Override
    public void updateOrder(Announcements announcement) {
        entityManager.merge(announcement);
    }

    @Override
    public void deleteOrder(Announcements announcement) {
        entityManager.remove(announcement);
    }
}