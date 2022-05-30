package com.imagenation.sql.Condition.Expressions;

import static com.imagenation.sql.Condition.ComparisonOperators.*;

import com.imagenation.sql.Condition.Expression;

public class GreaterEqual extends Expression {
    
    public <T extends Enum<T>, U extends Number> GreaterEqual(Enum<T> field, U value) {
        super(field + " " + GreaterEqual + " " + value);
    }
}
