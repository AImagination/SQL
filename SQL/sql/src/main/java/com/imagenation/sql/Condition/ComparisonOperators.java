package com.imagenation.sql.Condition;

public enum ComparisonOperators {
    
    Equal("="), NotEqual("!="), Greater(">"), Less("<"), GreaterEqual(">="), LessEqual("<="), Between("BETWEEN"),
    OpBracket("("), ClBracket(")");

    private final String _name;

    ComparisonOperators(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        return _name;
    }
}
