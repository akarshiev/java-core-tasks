package com.pdp.online.quiz.core;

import java.util.UUID;

/**
 * Abstract generic class providing UUID id
 */
public abstract class GenericClass implements BaseClass {
    protected final UUID id;

    public GenericClass() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
