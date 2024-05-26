package billGuru.dao;

import java.io.Serializable;
import java.util.Collection;

public interface BaseDao {
    public void saveObject(Object o);

    public void deleteObject(Object object);
    
    @SuppressWarnings("rawtypes")
    public void saveAll(Collection c);

    @SuppressWarnings("rawtypes")
    public Object getObject(final Class clazz, Serializable id);

    @SuppressWarnings("rawtypes")
    public void removeObject(Class clazz, Serializable id);
}
