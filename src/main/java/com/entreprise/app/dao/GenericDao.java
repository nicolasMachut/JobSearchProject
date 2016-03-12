package com.entreprise.app.dao;

import java.io.Serializable;

/**
 * Created by machu on 12/03/2016.
 */
public interface GenericDao <T, PK extends Serializable> {

    PK create(T newInstance);

    T find (PK id);

    void update (T transientObject);

    void delete (T persistentObject);

}
