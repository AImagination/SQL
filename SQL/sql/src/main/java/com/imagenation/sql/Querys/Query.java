package com.imagenation.sql.Querys;

public abstract class Query {

    protected String Command;

    @Override
    public String toString() {
        return Command;
    }
}
