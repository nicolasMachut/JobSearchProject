package com.entreprise.app.dao;

import com.entreprise.app.persistence.HibernateUtils;
import org.hibernate.Transaction;

import java.io.Serializable;

/**
 * Created by machu on 12/03/2016.
 */
public class GenericDaoImpl <T, PK extends Serializable> implements GenericDao <T, PK> {

    private Class<T> type;

    public GenericDaoImpl (Class<T> type) {
        this.type = type;
    }

    public PK create(Object newInstance) {
        Transaction trans = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        PK id = (PK) HibernateUtils.getSessionFactory().getCurrentSession().save(newInstance);
        trans.commit();
        return id;
    }

    public T find(Serializable id) {
        return HibernateUtils.getSessionFactory().getCurrentSession().get(type, id);
    }

    public void update(T transientObject) {
        HibernateUtils.getSessionFactory().getCurrentSession().update(transientObject);
    }

    public void delete(T persistentObject) {
        HibernateUtils.getSessionFactory().getCurrentSession().delete(persistentObject);
    }
}
