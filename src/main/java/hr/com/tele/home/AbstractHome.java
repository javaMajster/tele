package hr.com.tele.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractHome<T> {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractHome.class);

    @PersistenceContext
    protected EntityManager entityManager;


    /**
     * Flushes the entity manager.
     */
    public void flush() {
        this.entityManager.flush();
    }

    /**
     * Saves a transient entity to the database and changes it's status to persitent.
     *
     * @param transientInstance
     */
    public void persist(T transientInstance) {
        try {
            entityManager.persist(transientInstance);
        } catch (RuntimeException re) {
            LOG.error(re.getMessage(), re);
            throw re;
        }
    }

    /**
     * Remove an entity from the database.
     *
     * @param persistentInstance
     */
    public void remove(T persistentInstance) {
        try {
            entityManager.remove(persistentInstance);
        } catch (RuntimeException re) {
            LOG.error(re.getMessage(), re);
            throw re;
        }
    }

    /**
     * Saves a detached entity to the database.
     *
     * @param detachedInstance
     * @return
     */
    public T merge(T detachedInstance) {
        try {
            return entityManager.merge(detachedInstance);
        } catch (RuntimeException re) {
            LOG.error(re.getMessage(), re);
            throw re;
        }
    }

    /**
     * Saves a detached entity to the database and flushes the entity manager.
     *
     * @param detachedInstance
     * @return
     */
    public T mergeAndFlush(T detachedInstance) {
        try {
            T result = entityManager.merge(detachedInstance);
            entityManager.flush();
            return result;
        } catch (RuntimeException re) {
            LOG.error(re.getMessage(), re);
            throw re;
        }
    }

    /**
     * Loads an enitity by it's Id from the database.
     *
     * @param id
     * @return
     */
    public abstract T findById(Object id);


}
