package billGuru.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import billGuru.dao.BaseDao;

@Repository
@Transactional
public class BaseDaoImpl implements BaseDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveObject(Object object) {
        entityManager.merge(object);
    }

    @Override
    public void deleteObject(Object object) {
        entityManager.remove(entityManager.contains(object) ? object : entityManager.merge(object));
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void saveAll(Collection collection) {
        for (Object object : collection) {
            entityManager.merge(object);
        }
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Object getObject(final Class clazz, Serializable id) {
        return entityManager.find(clazz, id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("rawtypes")
    public void removeObject(Class clazz, Serializable id) {
        Object entity = getObject(clazz, id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }
}