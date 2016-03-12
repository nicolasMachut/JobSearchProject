package com.entreprise.app.dao;

import com.entreprise.app.entities.Entreprise;

/**
 * Created by machu on 12/03/2016.
 */
public class EntrepriseDao extends GenericDaoImpl <Entreprise, Integer> {

    public EntrepriseDao() {
        super(Entreprise.class);
    }
}
