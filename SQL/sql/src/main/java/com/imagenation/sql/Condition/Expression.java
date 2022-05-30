package com.imagenation.sql.Condition;

import static com.imagenation.sql.Condition.LogicOperators.*;
import static com.imagenation.sql.Condition.ComparisonOperators.*;


public class Expression {

    private String _value;

    public Expression(String value) {
        _value = value;
    }

    public Expression and(Expression secondOperator) {
        return new Expression(_value + " " + And  + " " + secondOperator.toString());
    }

    public Expression or(Expression secondOperator) {
        return new Expression(_value + " " + Or + " " + secondOperator.toString());
    }

    public Expression closeBracket() {
        return new Expression(_value + ClBracket);
    }

    @Override
    public String toString() {
        return _value;
    }
}
