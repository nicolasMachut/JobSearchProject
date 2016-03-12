package com.entreprise.app.entities;

import javax.persistence.*;

/**
 * Created by machu on 12/03/2016.
 */

@Entity
@Table(name = "EntrepriseService")
public class Entreprise {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="name")
    private String name;

    public Entreprise(String name) {
        this.name = name;
    }
}
