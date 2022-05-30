package com.imagenation.sql.Condition;

public enum LogicOperators {
    
    And("AND"), Or("Or"), Not("NOT"), In("IN"), NotIn("NOT IN");

    private final String _name;

    LogicOperators(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        return _name;
    }
}
