package com.jobrunner.oracle.jobrunroracle.model;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Entity
public class Person {
    @Id
    private final Long id;
    private final String name;

    /**
     * Constructor used by Hibernated
     */
    public Person() {
        this.id = null;
        this.name = null;
    }
}
